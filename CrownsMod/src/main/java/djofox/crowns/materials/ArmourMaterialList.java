package djofox.crowns.materials;

import djofox.crowns.Main;
import djofox.crowns.init.ItemInit;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public enum ArmourMaterialList implements IArmorMaterial {

	   LEATHER_CROWN("leather_crown", 40, new int[]{1, 2, 3, 1}, 1, ItemInit.binding.get(), "entity.experience_orb.pickup", 1.0F, 0.0F),
	   CHAINMAIL_CROWN("chainmail_crown", 40, new int[]{2, 5, 6, 2}, 1, ItemInit.binding.get(), "entity.experience_orb.pickup", 1.0F, 0.0F),
	   GOLD_CROWN("gold_crown", 40, new int[]{2, 5, 6, 2}, 1, ItemInit.binding.get(), "entity.experience_orb.pickup", 1.0F, 0.0F),
	   IRON_CROWN("iron_crown", 40, new int[]{2, 6, 7, 2}, 1, ItemInit.binding.get(), "entity.experience_orb.pickup", 1.0F, 0.0F),
	   DIAMOND_CROWN("diamond_crown", 40, new int[]{2, 5, 6, 3}, 1, ItemInit.binding.get(), "entity.experience_orb.pickup", 1.0F, 0.0F),
	   NETHERITE_CROWN("netherite_crown", 40, new int[]{3, 6, 8, 4}, 1, ItemInit.binding.get(), "entity.experience_orb.pickup", 1.0F, 0.0F),
	   SHULKER_CROWN("shulker_crown", 40, new int[]{4, 7, 8, 5}, 1, ItemInit.binding.get(), "entity.shulker.ambient", 1.0F, -1.25F);


private static final int[] MAX_DAMAGE_ARRAY = new int[] { 13, 15, 16, 11 };
private final String name, equipSound;
private int[] damageReductionAmounts;
private final int durability, enchantability;
private final float toughness;
private final float kb;
private Item repairItem;

private ArmourMaterialList(String nameIn, int durability, int[] damageReductionAmounts, int enchantability, Item repairItem, String equipSound, float toughness, float kb) {
	this.name = nameIn;
 this.durability = durability;
	this.damageReductionAmounts = damageReductionAmounts;
	this.enchantability = enchantability;
	this.toughness = toughness;
	this.kb = kb;
	this.equipSound = equipSound;
	this.repairItem = repairItem;
	
}

public int getEnchantability() {
	return this.enchantability;
}

@Override
public SoundEvent getSoundEvent() {
	return new SoundEvent(new ResourceLocation(equipSound));
}

public Ingredient getRepairMaterial() {
	return Ingredient.fromItems(this.repairItem);
}

@OnlyIn(Dist.CLIENT)
public String getName() {
	return Main.MODID + ":" + this.name;
}

public float getToughness() {
	return this.toughness;
}

@Override
public int getDamageReductionAmount(EquipmentSlotType slot) {
	return this.damageReductionAmounts[slot.getIndex()];
}

@Override
public int getDurability(EquipmentSlotType slot) {
return MAX_DAMAGE_ARRAY[slot.getIndex()] * this.durability;
}

@Override
public float getKnockbackResistance() {
	return this.kb;
}

}