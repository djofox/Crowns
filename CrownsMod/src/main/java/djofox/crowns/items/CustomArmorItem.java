package djofox.crowns.items;

import djofox.crowns.init.ItemInit;
import djofox.crowns.potion.PotionList;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class CustomArmorItem extends ArmorItem {

	    public CustomArmorItem(IArmorMaterial materialIn, EquipmentSlotType slots, Properties properties) {
	        super(materialIn, slots, properties);

	    }

	    static int airTime = 0;
	@Override
	public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
		
		if (player.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem().equals(ItemInit.LEATHER_CROWN.get())
				&& player.getItemStackFromSlot(EquipmentSlotType.CHEST).getItem().equals(Items.LEATHER_CHESTPLATE)
				&& player.getItemStackFromSlot(EquipmentSlotType.LEGS).getItem().equals(Items.LEATHER_LEGGINGS)
				&& player.getItemStackFromSlot(EquipmentSlotType.FEET).getItem().equals(Items.LEATHER_BOOTS)) {
				player.addPotionEffect(new EffectInstance(Effects.HASTE, 15, 1, false, false));
			}
		else if (player.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem().equals(ItemInit.LEATHER_CROWN.get())) {
			player.addPotionEffect(new EffectInstance(Effects.HASTE, 15, 0, false, false));
		}
		else if (player.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem().equals(ItemInit.CHAINMAIL_CROWN.get())
				&& player.getItemStackFromSlot(EquipmentSlotType.CHEST).getItem().equals(Items.CHAINMAIL_CHESTPLATE)
				&& player.getItemStackFromSlot(EquipmentSlotType.LEGS).getItem().equals(Items.CHAINMAIL_LEGGINGS)
				&& player.getItemStackFromSlot(EquipmentSlotType.FEET).getItem().equals(Items.CHAINMAIL_BOOTS)) {
				player.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 15, 1, false, false));
			}
		else if (player.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem().equals(ItemInit.CHAINMAIL_CROWN.get())) {
			player.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 15, 0, false, false));
		}
		else if (player.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem().equals(ItemInit.GOLD_CROWN.get())
				&& player.getItemStackFromSlot(EquipmentSlotType.CHEST).getItem().equals(Items.GOLDEN_CHESTPLATE)
				&& player.getItemStackFromSlot(EquipmentSlotType.LEGS).getItem().equals(Items.GOLDEN_LEGGINGS)
				&& player.getItemStackFromSlot(EquipmentSlotType.FEET).getItem().equals(Items.GOLDEN_BOOTS)) {
				player.addPotionEffect(new EffectInstance(PotionList.MORE_HEALTH_EFFECT.get(), 15, 2, false, false));
				player.addPotionEffect(new EffectInstance(Effects.HERO_OF_THE_VILLAGE, 15, 0, false, false));
			}
		else if (player.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem().equals(ItemInit.GOLD_CROWN.get())) {
			player.addPotionEffect(new EffectInstance(PotionList.MORE_HEALTH_EFFECT.get(), 15, 0, false, false));
		}
		else if (player.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem().equals(ItemInit.IRON_CROWN.get())
				&& player.getItemStackFromSlot(EquipmentSlotType.CHEST).getItem().equals(Items.IRON_CHESTPLATE)
				&& player.getItemStackFromSlot(EquipmentSlotType.LEGS).getItem().equals(Items.IRON_LEGGINGS)
				&& player.getItemStackFromSlot(EquipmentSlotType.FEET).getItem().equals(Items.IRON_BOOTS)) {
				player.addPotionEffect(new EffectInstance(Effects.SPEED, 15, 1, false, false));

			}
		else if (player.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem().equals(ItemInit.IRON_CROWN.get())) {
			player.addPotionEffect(new EffectInstance(Effects.SPEED, 15, 0, false, false));
		}
		else if (player.getItemStackFromSlot(EquipmentSlotType.CHEST).getItem().equals(Items.DIAMOND_CHESTPLATE)
				&& player.getItemStackFromSlot(EquipmentSlotType.LEGS).getItem().equals(Items.DIAMOND_LEGGINGS)
				&& player.getItemStackFromSlot(EquipmentSlotType.FEET).getItem().equals(Items.DIAMOND_BOOTS)
				&& player.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem().equals(ItemInit.DIAMOND_CROWN.get())) {
				player.addPotionEffect(new EffectInstance(Effects.CONDUIT_POWER, 15, 0, false, false));
				player.addPotionEffect(new EffectInstance(Effects.DOLPHINS_GRACE, 15, 0, false, false));

			}
		else if (player.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem().equals(ItemInit.DIAMOND_CROWN.get())) {
			player.addPotionEffect(new EffectInstance(Effects.CONDUIT_POWER, 15, 0, false, false));
		}
		else if (player.getItemStackFromSlot(EquipmentSlotType.CHEST).getItem().equals(Items.NETHERITE_CHESTPLATE)
				&& player.getItemStackFromSlot(EquipmentSlotType.LEGS).getItem().equals(Items.NETHERITE_LEGGINGS)
				&& player.getItemStackFromSlot(EquipmentSlotType.FEET).getItem().equals(Items.NETHERITE_BOOTS)
				&& player.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem().equals(ItemInit.NETHERITE_CROWN.get())) {
				player.addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 15, 0, false, false));
				player.addPotionEffect(new EffectInstance(Effects.STRENGTH, 15, 0, false, false));
				player.addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, 15, 0, false, false));

			}
		else if (player.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem().equals(ItemInit.NETHERITE_CROWN.get())) {
			player.addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 15, 0, false, false));
		}
		else if (player.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem().equals(ItemInit.SHULKER_CROWN.get())) {	

			if (!player.isCrouching()) {
				player.addPotionEffect(new EffectInstance(Effects.LEVITATION, 15, 0, false, false));
				player.removeActivePotionEffect(Effects.SLOW_FALLING);
			}

			if (player.isCrouching()) {
				player.removeActivePotionEffect(Effects.LEVITATION);
				player.removeActivePotionEffect(Effects.SLOW_FALLING);
			}
			if (airTime >= 60 && player.isSprinting()) {
				player.addPotionEffect(new EffectInstance(Effects.SLOW_FALLING, 15, 0, false, false));
				player.removeActivePotionEffect(Effects.LEVITATION);
			}
			//If is airborne for +2seconds so that sprinting wont apply. Ask Nathan for this.
		}
	}
	
}