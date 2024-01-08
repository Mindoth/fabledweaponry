package net.mindoth.fabledweaponry.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShieldItem;

public class BulwarkItem extends ShieldItem {

    public BulwarkItem(Properties p_i48470_1_) {
        super(p_i48470_1_);
    }

    @Override
    public boolean isEnchantable(ItemStack p_77616_1_) {
        return true;
    }
}
