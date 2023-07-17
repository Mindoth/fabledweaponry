package net.mindoth.fabledweaponry.item.bulwark;

import net.mindoth.fabledweaponry.item.BulwarkItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class BulwarkGold extends BulwarkItem {
    public BulwarkGold(Properties p_i48470_1_) {
        super(p_i48470_1_);
    }

    @Override
    public boolean isValidRepairItem(ItemStack pToRepair, ItemStack pRepair) {
        return pRepair.getItem() == Items.GOLD_INGOT || super.isValidRepairItem(pToRepair, pRepair);
    }
}
