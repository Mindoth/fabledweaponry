package net.mindoth.fabledweaponry.item;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.event.EventHooks;

import java.util.List;

public class LongbowItem extends BowItem {

    public LongbowItem(Properties p_i48522_1_) {
        super(p_i48522_1_);
    }

    protected float velocityMult() {
        return 3.0F;
    }

    public void releaseUsing(ItemStack stack, Level level, LivingEntity entityLiving, int timeLeft) {
        if (entityLiving instanceof Player player) {
            ItemStack itemstack = player.getProjectile(stack);
            if (!itemstack.isEmpty()) {
                int i = this.getUseDuration(stack, entityLiving) - timeLeft;
                i = EventHooks.onArrowLoose(stack, level, player, i, !itemstack.isEmpty());
                if (i < 0) {
                    return;
                }

                float f = getLongPowerForTime(i);
                if (!((double)f < 0.1)) {
                    List<ItemStack> list = draw(stack, itemstack, player);
                    if (level instanceof ServerLevel) {
                        ServerLevel serverlevel = (ServerLevel)level;
                        if (!list.isEmpty()) {
                            this.shoot(serverlevel, player, player.getUsedItemHand(), stack, list, f * velocityMult(), 0.5F, f == 1.0F, (LivingEntity)null);
                        }
                    }

                    level.playSound((Player)null, player.getX(), player.getY(), player.getZ(), SoundEvents.ARROW_SHOOT, SoundSource.PLAYERS, 1.0F, 1.0F / (level.getRandom().nextFloat() * 0.4F + 1.2F) + f * 0.5F);
                    player.awardStat(Stats.ITEM_USED.get(this));
                }
            }
        }
    }

    public static float getLongPowerForTime(int pCharge) {
        float f = (float)pCharge / 40.0F;
        f = (f * f + f * 2.0F) / 3.0F;
        if (f > 1.0F) {
            f = 1.0F;
        }

        return f;
    }
}
