package net.mindoth.fabledweaponry.item.ballista;

import net.mindoth.fabledweaponry.item.BallistaItem;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.ChargedProjectiles;
import net.minecraft.world.level.Level;

public class BallistaDiamond extends BallistaItem {
    public BallistaDiamond(Properties p_i50052_1_) {
        super(p_i50052_1_);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        /*
        ItemStack itemstack = player.getItemInHand(hand);
        if (isCharged(itemstack)) {
            performShooting(level, player, hand, itemstack, getHeavyShootingPower(itemstack) * 3, 0.5F);
            setCharged(itemstack, false);
            return InteractionResultHolder.consume(itemstack);
        } else if (!player.getProjectile(itemstack).isEmpty()) {
            if (!isCharged(itemstack)) {
                this.startSoundPlayed = false;
                this.midLoadSoundPlayed = false;
                player.startUsingItem(hand);
            }

            return InteractionResultHolder.consume(itemstack);
        }
        else {
            return InteractionResultHolder.fail(itemstack);
        }
        */
        ItemStack itemstack = player.getItemInHand(hand);
        ChargedProjectiles chargedprojectiles = (ChargedProjectiles)itemstack.get(DataComponents.CHARGED_PROJECTILES);
        if (chargedprojectiles != null && !chargedprojectiles.isEmpty()) {
            this.performShooting(level, player, hand, itemstack, getHeavyShootingPower(chargedprojectiles) * 3, 0.5F, (LivingEntity)null);
            return InteractionResultHolder.consume(itemstack);
        } else if (!player.getProjectile(itemstack).isEmpty()) {
            this.startSoundPlayed = false;
            this.midLoadSoundPlayed = false;
            player.startUsingItem(hand);
            return InteractionResultHolder.consume(itemstack);
        } else {
            return InteractionResultHolder.fail(itemstack);
        }
    }
}
