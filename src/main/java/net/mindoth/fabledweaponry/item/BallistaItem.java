package net.mindoth.fabledweaponry.item;

import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.ChargedProjectiles;
import net.minecraft.world.item.enchantment.EnchantmentEffectComponents;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;

import java.util.List;
import java.util.Optional;

public class BallistaItem extends CrossbowItem {
    public BallistaItem(Properties p_i50052_1_) {
        super(p_i50052_1_);
    }

    protected boolean startSoundPlayed = false;
    protected boolean midLoadSoundPlayed = false;

    @Override
    public void releaseUsing(ItemStack stack, Level level, LivingEntity entityLiving, int timeLeft) {
        /*
        int i = this.getUseDuration(pStack) - pTimeLeft;
        float f = getBallistaPowerForTime(i, pStack);
        if (f >= 1.0F && !isCharged(pStack) && tryBallistaLoadProjectiles(pEntityLiving, pStack)) {
            setCharged(pStack, true);
            SoundSource soundsource = pEntityLiving instanceof Player ? SoundSource.PLAYERS : SoundSource.HOSTILE;
            pLevel.playSound((Player)null, pEntityLiving.getX(), pEntityLiving.getY(), pEntityLiving.getZ(), SoundEvents.CROSSBOW_LOADING_END, soundsource, 1.0F, 1.0F / (pLevel.getRandom().nextFloat() * 0.5F + 1.0F) + 0.2F);
        }
        */
        int i = this.getUseDuration(stack, entityLiving) - timeLeft;
        float f = getBallistaPowerForTime(i, stack, entityLiving);
        if (f >= 1.0F && !isCharged(stack) && tryBallistaLoadProjectiles(entityLiving, stack)) {
            ChargingSounds crossbowitem$chargingsounds = this.getChargingSounds(stack);
            crossbowitem$chargingsounds.end().ifPresent((p_352852_) -> {
                level.playSound((Player)null, entityLiving.getX(), entityLiving.getY(), entityLiving.getZ(), (SoundEvent)p_352852_.value(), entityLiving.getSoundSource(), 1.0F, 1.0F / (level.getRandom().nextFloat() * 0.5F + 1.0F) + 0.2F);
            });
        }
    }

    private ChargingSounds getChargingSounds(ItemStack stack) {
        return (ChargingSounds)EnchantmentHelper.pickHighestLevel(stack, EnchantmentEffectComponents.CROSSBOW_CHARGING_SOUNDS).orElse(DEFAULT_SOUNDS);
    }

    private static final ChargingSounds DEFAULT_SOUNDS;

    static {
        DEFAULT_SOUNDS = new ChargingSounds(Optional.of(SoundEvents.CROSSBOW_LOADING_START), Optional.of(SoundEvents.CROSSBOW_LOADING_MIDDLE), Optional.of(SoundEvents.CROSSBOW_LOADING_END));
    }

    @Override
    public int getUseDuration(ItemStack pStack, LivingEntity entity) {
        return getBallistaChargeDuration(pStack, entity) + 3;
    }

    private static float getBallistaPowerForTime(int pUseTime, ItemStack pCrossbowStack, LivingEntity shooter) {
        float f = (float)pUseTime / ((float)getChargeDuration(pCrossbowStack, shooter) * 2);
        if (f > 1.0F) {
            f = 1.0F;
        }

        return f;
    }

    private static int getBallistaChargeDuration(ItemStack stack, LivingEntity shooter) {
        /*
        int i = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.QUICK_CHARGE, stack);
        return i == 0 ? 50 : 50 - 5 * i;
        */

        float f = EnchantmentHelper.modifyCrossbowChargingTime(stack, shooter, 1.25F * 2 /*Added Times 2*/);
        return Mth.floor(f * 20.0F);
    }

    private static boolean tryBallistaLoadProjectiles(LivingEntity shooter, ItemStack crossbowStack) {
        /*
        int i = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MULTISHOT, crossbowStack);
        int j = i == 0 ? 1 : 3;
        boolean flag = shooter instanceof Player && ((Player)shooter).getAbilities().instabuild;
        ItemStack itemstack = shooter.getProjectile(crossbowStack);
        ItemStack itemstack1 = itemstack.copy();

        for(int k = 0; k < j; ++k) {
            if (k > 0) {
                itemstack = itemstack1.copy();
            }

            if (itemstack.isEmpty() && flag) {
                itemstack = new ItemStack(Items.ARROW);
                itemstack1 = itemstack.copy();
            }

            if (!loadBallistaProjectile(shooter, crossbowStack, itemstack, k > 0, flag)) {
                return false;
            }
        }

        return true;
        */
        List<ItemStack> list = draw(crossbowStack, shooter.getProjectile(crossbowStack), shooter);
        if (!list.isEmpty()) {
            crossbowStack.set(DataComponents.CHARGED_PROJECTILES, ChargedProjectiles.of(list));
            return true;
        } else {
            return false;
        }
    }

    /*
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
    */

    /*
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
    */

    /*
    protected static float getHeavyShootingPower(ItemStack pCrossbowStack) {
        return pCrossbowStack.getItem() instanceof CrossbowItem && containsChargedProjectile(pCrossbowStack, Items.FIREWORK_ROCKET) ? 1.6F : 3.15F;
    }
    */

    protected static float getHeavyShootingPower(ChargedProjectiles projectile) {
        return projectile.contains(Items.FIREWORK_ROCKET) ? 1.6F : 3.15F;
    }
}
