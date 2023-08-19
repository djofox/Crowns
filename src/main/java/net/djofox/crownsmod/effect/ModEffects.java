package net.djofox.crownsmod.effect;

import net.djofox.crownsmod.CrownsMod;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.rmi.registry.Registry;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS
            = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, CrownsMod.MOD_ID);

    public static final RegistryObject<MobEffect> FREEZE = MOB_EFFECTS.register("freeze",
            () -> new FreezeEffect(MobEffectCategory.HARMFUL, 3124687));
    public static final RegistryObject<MobEffect> MOREHEARTS = MOB_EFFECTS.register("more_hearts",
            ()-> new MoreHeartsEffect(MobEffectCategory.BENEFICIAL, 0xd4ff00).addAttributeModifier(Attributes.MAX_HEALTH, "659D7064-3A60-4F51-8ABE-C0D53A6DC7A9", 0.1D, AttributeModifier.Operation.MULTIPLY_BASE));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
