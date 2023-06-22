package net.mindoth.fabledweaponry.item.ballista;

import net.mindoth.fabledweaponry.item.BallistaItem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class BallistaDiamond extends BallistaItem {
    public BallistaDiamond(Properties p_i50052_1_) {
        super(p_i50052_1_);
    }

    @Override
    public ActionResult<ItemStack> use(World pLevel, PlayerEntity pPlayer, Hand pHand) {
        ItemStack itemstack = pPlayer.getItemInHand(pHand);
        if (isCharged(itemstack)) {
            performShooting(pLevel, pPlayer, pHand, itemstack, getHeavyShootingPower(itemstack) * 5, 0.5F);
            setCharged(itemstack, false);
            return ActionResult.consume(itemstack);
        } else if (!pPlayer.getProjectile(itemstack).isEmpty()) {
            if (!isCharged(itemstack)) {
                this.startSoundPlayed = false;
                this.midLoadSoundPlayed = false;
                pPlayer.startUsingItem(pHand);
            }

            return ActionResult.consume(itemstack);
        } else {
            return ActionResult.fail(itemstack);
        }
    }
}
