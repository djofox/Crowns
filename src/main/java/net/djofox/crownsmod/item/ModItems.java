package net.djofox.crownsmod.item;

import net.djofox.crownsmod.CrownsMod;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CrownsMod.MOD_ID);

    public static final RegistryObject<Item> GLOOP = ITEMS.register("gloop",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BINDING = ITEMS.register("binding",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SOULSTONE = ITEMS.register("soul_stone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LEATHER_CROWN = ITEMS.register("leather_crown",
            () -> new ModArmourCrowns(ModArmourMaterials.LEATHERCROWN, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> CHAINMAIL_CROWN = ITEMS.register("chainmail_crown",
            () -> new ModArmourCrowns(ModArmourMaterials.CHAINMAILCROWN, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> IRON_CROWN = ITEMS.register("iron_crown",
            () -> new ModArmourCrowns(ModArmourMaterials.IRONCROWN, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_CROWN = ITEMS.register("golden_crown",
            () -> new ModArmourCrowns(ModArmourMaterials.GOLDENCROWN, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_CROWN = ITEMS.register("diamond_crown",
            () -> new ModArmourCrowns(ModArmourMaterials.DIAMONDCROWN, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_CROWN = ITEMS.register("netherite_crown",
            () -> new ModArmourCrowns(ModArmourMaterials.NETHERITECROWN, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SHULKER_CROWN = ITEMS.register("shulker_crown",
            () -> new ModArmourCrowns(ModArmourMaterials.SHULKERCROWN, ArmorItem.Type.HELMET, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
