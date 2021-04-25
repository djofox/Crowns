package djofox.crowns.init;

import djofox.crowns.Main;
import djofox.crowns.items.CustomArmorItem;
import djofox.crowns.materials.ArmourMaterialList;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);

	//Items
	public static final RegistryObject<Item> soulstone = ITEMS.register("soul_stone",
			() -> new Item(new Item.Properties().group(Main.CROWNS_GROUP)));
	public static final RegistryObject<Item> binding = ITEMS.register("binding",
			() -> new Item(new Item.Properties().group(Main.CROWNS_GROUP)));
	public static final RegistryObject<Item> gloop = ITEMS.register("gloop",
			() -> new Item(new Item.Properties().group(Main.CROWNS_GROUP)));
	//Armor & Tools
	public static final RegistryObject<Item> LEATHER_CROWN = ITEMS.register("leather_crown", () -> new CustomArmorItem(ArmourMaterialList.LEATHER_CROWN, EquipmentSlotType.HEAD, new Item.Properties().group(Main.CROWNS_GROUP)));
	public static final RegistryObject<Item> CHAINMAIL_CROWN = ITEMS.register("chainmail_crown", () -> new CustomArmorItem(ArmourMaterialList.CHAINMAIL_CROWN, EquipmentSlotType.HEAD, new Item.Properties().group(Main.CROWNS_GROUP)));
	public static final RegistryObject<Item> GOLD_CROWN = ITEMS.register("gold_crown", () -> new CustomArmorItem(ArmourMaterialList.GOLD_CROWN, EquipmentSlotType.HEAD, new Item.Properties().group(Main.CROWNS_GROUP)));
	public static final RegistryObject<Item> IRON_CROWN = ITEMS.register("iron_crown", () -> new CustomArmorItem(ArmourMaterialList.IRON_CROWN, EquipmentSlotType.HEAD, new Item.Properties().group(Main.CROWNS_GROUP)));
	public static final RegistryObject<Item> DIAMOND_CROWN = ITEMS.register("diamond_crown", () -> new CustomArmorItem(ArmourMaterialList.DIAMOND_CROWN, EquipmentSlotType.HEAD, new Item.Properties().group(Main.CROWNS_GROUP)));
	public static final RegistryObject<Item> NETHERITE_CROWN = ITEMS.register("netherite_crown", () -> new CustomArmorItem(ArmourMaterialList.NETHERITE_CROWN, EquipmentSlotType.HEAD, new Item.Properties().group(Main.CROWNS_GROUP)));
	public static final RegistryObject<Item> SHULKER_CROWN = ITEMS.register("shulker_crown", () -> new CustomArmorItem(ArmourMaterialList.SHULKER_CROWN, EquipmentSlotType.HEAD, new Item.Properties().group(Main.CROWNS_GROUP)));

}
