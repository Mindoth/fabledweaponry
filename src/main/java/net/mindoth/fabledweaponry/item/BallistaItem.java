package net.mindoth.fabledweaponry.item;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;

public class BallistaItem extends CrossbowItem {
    public BallistaItem(Properties p_i50052_1_) {
        super(p_i50052_1_);
    }

    protected boolean startSoundPlayed = false;
    protected boolean midLoadSoundPlayed = false;

    @Override
    public void releaseUsing(ItemStack pStack, Level pLevel, LivingEntity pEntityLiving, int pTimeLeft) {
        int i = this.getUseDuration(pStack) - pTimeLeft;
        float f = getBallistaPowerForTime(i, pStack);
        if (f >= 1.0F && !isCharged(pStack) && tryBallistaLoadProjectiles(pEntityLiving, pStack)) {
            setCharged(pStack, true);
            SoundSource soundsource = pEntityLiving instanceof Player ? SoundSource.PLAYERS : SoundSource.HOSTILE;
            pLevel.playSound((Player)null, pEntityLiving.getX(), pEntityLiving.getY(), pEntityLiving.getZ(), SoundEvents.CROSSBOW_LOADING_END, soundsource, 1.0F, 1.0F / (pLevel.getRandom().nextFloat() * 0.5F + 1.0F) + 0.2F);
        }

    }

    @Override
    public int getUseDuration(ItemStack pStack) {
        return getBallistaChargeDuration(pStack) + 3;
    }

    private static float getBallistaPowerForTime(int pUseTime, ItemStack pCrossbowStack) {
        float f = (float)pUseTime / ((float)getChargeDuration(pCrossbowStack) * 2);
        if (f > 1.0F) {
            f = 1.0F;
        }

        return f;
    }

    private static int getBallistaChargeDuration(ItemStack pCrossbowStack) {
        int i = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.QUICK_CHARGE, pCrossbowStack);
        return i == 0 ? 50 : 50 - 5 * i;
    }

    private static boolean tryBallistaLoadProjectiles(LivingEntity pShooter, ItemStack pCrossbowStack) {
        int i = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MULTISHOT, pCrossbowStack);
        int j = i == 0 ? 1 : 3;
        boolean flag = pShooter instanceof Player && ((Player)pShooter).getAbilities().instabuild;
        ItemStack itemstack = pShooter.getProjectile(pCrossbowStack);
        ItemStack itemstack1 = itemstack.copy();

        for(int k = 0; k < j; ++k) {
            if (k > 0) {
                itemstack = itemstack1.copy();
            }

            if (itemstack.isEmpty() && flag) {
                itemstack = new ItemStack(Items.ARROW);
                itemstack1 = itemstack.copy();
            }

            if (!loadBallistaProjectile(pShooter, pCrossbowStack, itemstack, k > 0, flag)) {
                return false;
            }
        }

        return true;
    }

    private static boolean loadBallistaProjectile(LivingEntity pShooter, ItemStack pCrossbowStack, ItemStack pAmmoStack, boolean pHasAmmo, boolean pIsCreative) {
        if (pAmmoStack.isEmpty()) {
            return false;
        } else {
            boolean flag = pIsCreative && pAmmoStack.getItem() instanceof ArrowItem;
            ItemStack itemstack;
            if (!flag && !pIsCreative && !pHasAmmo) {
                itemstack = pAmmoStack.split(1);
                if (pAmmoStack.isEmpty() && pShooter instanceof Player) {
                    ((Player)pShooter).getInventory().removeItem(pAmmoStack);
                }
            } else {
                itemstack = pAmmoStack.copy();
            }

            addBallistaChargedProjectile(pCrossbowStack, itemstack);
            return true;
        }
    }

    private static void addBallistaChargedProjectile(ItemStack pCrossbowStack, ItemStack pAmmoStack) {
        CompoundTag compoundnbt = pCrossbowStack.getOrCreateTag();
        ListTag listnbt;
        if (compoundnbt.contains("ChargedProjectiles", 9)) {
            listnbt = compoundnbt.getList("ChargedProjectiles", 10);
        } else {
            listnbt = new ListTag();
        }

        CompoundTag compoundnbt1 = new CompoundTag();
        pAmmoStack.save(compoundnbt1);
        listnbt.add(compoundnbt1);
        compoundnbt.put("ChargedProjectiles", listnbt);
    }

    protected static float getHeavyShootingPower(ItemStack pCrossbowStack) {
        return pCrossbowStack.getItem() instanceof CrossbowItem && containsChargedProjectile(pCrossbowStack, Items.FIREWORK_ROCKET) ? 1.6F : 3.15F;
    }
}
