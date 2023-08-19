package net.djofox.crownsmod.util;

import net.djofox.crownsmod.CrownsMod;
import net.djofox.crownsmod.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CrownsMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CROWNS_TAB = CREATIVE_MODE_TABS.register("crowns_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DIAMOND_CROWN.get()))
                    .title(Component.translatable("creativetab.crownsmod"))
                    .displayItems((pParameters, spot) -> {
                        spot.accept(ModItems.BINDING.get());
                        spot.accept(ModItems.GLOOP.get());
                        spot.accept(ModItems.SOULSTONE.get());
                        spot.accept(ModItems.LEATHER_CROWN.get());
                        spot.accept(ModItems.GOLDEN_CROWN.get());
                        spot.accept(ModItems.CHAINMAIL_CROWN.get());
                        spot.accept(ModItems.IRON_CROWN.get());
                        spot.accept(ModItems.DIAMOND_CROWN.get());
                        spot.accept(ModItems.NETHERITE_CROWN.get());
                        spot.accept(ModItems.SHULKER_CROWN.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
