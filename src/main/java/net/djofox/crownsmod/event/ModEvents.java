package net.djofox.crownsmod.event;

import net.djofox.crownsmod.CrownsMod;
import net.djofox.crownsmod.effect.ModEffects;
import net.djofox.crownsmod.item.ModItems;
import net.minecraft.client.resources.language.I18n;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.Tags;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


public class ModEvents {

    @Mod.EventBusSubscriber(modid = CrownsMod.MOD_ID)
    public static class ForgeEvents {
        static int counter = 0;
        @SubscribeEvent
        public static void onArmourTick(TickEvent.PlayerTickEvent event) {
            Player player = event.player;
            ItemStack headSlot = player.getItemBySlot(EquipmentSlot.HEAD);

            if (headSlot.is(ModItems.LEATHER_CROWN.get())) {
                if (player.getItemBySlot(EquipmentSlot.CHEST).is(Items.LEATHER_CHESTPLATE)
                        && player.getItemBySlot(EquipmentSlot.LEGS).is(Items.LEATHER_LEGGINGS)
                        && player.getItemBySlot(EquipmentSlot.FEET).is(Items.LEATHER_BOOTS)) {
                    player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 2, 1, false, false, false));
                }
                else {
                    player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 2, 0, false, false, false));
                }
            }

            if (headSlot.is(ModItems.CHAINMAIL_CROWN.get())) {
                if (player.getItemBySlot(EquipmentSlot.CHEST).is(Items.CHAINMAIL_CHESTPLATE)
                        && player.getItemBySlot(EquipmentSlot.LEGS).is(Items.CHAINMAIL_LEGGINGS)
                        && player.getItemBySlot(EquipmentSlot.FEET).is(Items.CHAINMAIL_BOOTS)) {
                    player.addEffect(new MobEffectInstance(MobEffects.LUCK, 2, 3, false, false, false));
                }
                else {
                    player.addEffect(new MobEffectInstance(MobEffects.LUCK, 2, 1, false, false, false));
                }
            }

            if (headSlot.is(ModItems.GOLDEN_CROWN.get())) {
                if (player.getItemBySlot(EquipmentSlot.CHEST).is(Items.GOLDEN_CHESTPLATE)
                        && player.getItemBySlot(EquipmentSlot.LEGS).is(Items.GOLDEN_LEGGINGS)
                        && player.getItemBySlot(EquipmentSlot.FEET).is(Items.GOLDEN_BOOTS)) {

                    if(player.isCrouching()) {
                        if(counter >= 100) {
                            treasure(player, 2);
                            counter = 0;
                        } else if(counter < 10 || counter > 80) {
                            counter ++;
                        }
                        else {
                            counter++;
                            if (counter % 2 == 0) {player.playSound(SoundEvents.NOTE_BLOCK_SNARE.get(), 50, 2); }
                        }
                    }
                    else if(!player.isCrouching()){
                        counter = 0;
                    }

                }
                else {

                    if(player.isCrouching()) {
                        if(counter >= 200) {
                            counter = 0;
                            treasure(player, 1);
                        } else if(counter < 10 || counter > 180) {
                            counter ++;
                        }
                        else {
                            counter++;
                            if (counter % 2 == 0) {player.playSound(SoundEvents.NOTE_BLOCK_SNARE.get(), 50, 2); }
                        }
                    }
                    else if(!player.isCrouching()){
                        counter = 0;
                    }

                }
            }

            if (headSlot.is(ModItems.IRON_CROWN.get())) {
                if (player.getItemBySlot(EquipmentSlot.CHEST).is(Items.IRON_CHESTPLATE)
                        && player.getItemBySlot(EquipmentSlot.LEGS).is(Items.IRON_LEGGINGS)
                        && player.getItemBySlot(EquipmentSlot.FEET).is(Items.IRON_BOOTS)) {
                    player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2, 1, false, false, false));
                }
                else {
                    player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2, 0, false, false, false));
                }
            }

            if (headSlot.is(ModItems.DIAMOND_CROWN.get())) {
                if (player.getItemBySlot(EquipmentSlot.CHEST).is(Items.DIAMOND_CHESTPLATE)
                        && player.getItemBySlot(EquipmentSlot.LEGS).is(Items.DIAMOND_LEGGINGS)
                        && player.getItemBySlot(EquipmentSlot.FEET).is(Items.DIAMOND_BOOTS)) {
                    player.addEffect(new MobEffectInstance(ModEffects.MOREHEARTS.get(), 2, 2, false, false, false));
                }
                else {
                    player.addEffect(new MobEffectInstance(ModEffects.MOREHEARTS.get(), 2, 0, false, false, false));
                }
            }

            if (headSlot.is(ModItems.NETHERITE_CROWN.get())) {
                if (player.getItemBySlot(EquipmentSlot.CHEST).is(Items.NETHERITE_CHESTPLATE)
                        && player.getItemBySlot(EquipmentSlot.LEGS).is(Items.NETHERITE_LEGGINGS)
                        && player.getItemBySlot(EquipmentSlot.FEET).is(Items.NETHERITE_BOOTS)) {
                    player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2, 0, false, false, false));
                    player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 2, 0, false, false, false));
                    player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2, 0, false, false, false));
                }
                else {
                    player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2, 0, false, false, false));
                }
            }

            if (headSlot.is(ModItems.SHULKER_CROWN.get())) {
                if (player.isCrouching()) {
                    player.removeEffect(MobEffects.SLOW_FALLING);
                    player.removeEffect(MobEffects.LEVITATION);
                    player.resetFallDistance();
                } else if (player.isSprinting()) {
                    player.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 2, 1, false, false ,false));
                } else {
                    player.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 2, 1, false, false, false));
                }
            }

        }

        public static void treasure(Player player, int set){
            BlockPos position = player.getOnPos();
            boolean foundBlock = false;
            for (int i = 0; i < position.getY() + 64; i++) {
                BlockState state = player.level().getBlockState(position.below(i));
                if(state.getBlock().equals(Blocks.DEEPSLATE) && set <= 1) { break; }
                if(state.is(Tags.Blocks.ORES)) { //starts at top block and iterates down
                    player.playSound(SoundEvents.NOTE_BLOCK_PLING.get());
                    player.sendSystemMessage(Component.literal("§b" + I18n.get(state.getBlock().getDescriptionId())
                            + "§r -> y=" + (position.getY()-i)));
                    foundBlock = true;
                    player.getItemBySlot(EquipmentSlot.HEAD).hurtAndBreak(1, player, player1 -> player1.broadcastBreakEvent(EquipmentSlot.HEAD));
                    break;
                }
            }
            if(!foundBlock) {
                player.playSound(SoundEvents.NOTE_BLOCK_DIDGERIDOO.get());
                player.sendSystemMessage(Component.translatable("text.crownsmod.gcfailed"));
            }
        }
    }
}
