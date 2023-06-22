package net.mindoth.fabledweaponry.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShieldItem;

import javax.annotation.Nullable;

public class AegisItem extends ShieldItem {

    public AegisItem(Properties p_i48470_1_) {
        super(p_i48470_1_);
    }

    @Override
    public boolean isShield(ItemStack stack, @Nullable LivingEntity entity) {
        return true;
    }

    @Override
    public boolean isEnchantable(ItemStack p_77616_1_) {
        return true;
    }
}
