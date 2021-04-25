package djofox.crowns.potion;

import djofox.crowns.Main;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.Potion;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class PotionList {

	//More health
	public static final DeferredRegister<Effect> EFFECTS = DeferredRegister.create(ForgeRegistries.POTIONS, Main.MODID);
	
	public static final RegistryObject<Effect> MORE_HEALTH_EFFECT = EFFECTS.register("more_health", () -> (new MoreHealthEffect(EffectType.BENEFICIAL, 0xd4ff00)).addAttributesModifier(Attributes.MAX_HEALTH, "659D7064-3A60-4F51-8ABE-C0D53A6DC7A9", 0.2D, AttributeModifier.Operation.MULTIPLY_BASE));
	
	public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(ForgeRegistries.POTION_TYPES, Main.MODID);

	//public static final RegistryObject<Potion> MORE_HEALTH_POTION = POTIONS.register("more_health", () -> new Potion(new EffectInstance(MORE_HEALTH_EFFECT.get(), 3600)));
	
	
	
	public static class MoreHealthEffect extends Effect {

		public MoreHealthEffect(EffectType typeIn, int liquidColorIn) {
			super(typeIn, liquidColorIn);
			
		}
		
	}
}