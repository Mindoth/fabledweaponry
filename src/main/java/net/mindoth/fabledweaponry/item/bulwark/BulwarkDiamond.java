package net.mindoth.fabledweaponry.item.bulwark;

import net.mindoth.fabledweaponry.item.BulwarkItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class BulwarkDiamond extends BulwarkItem {
    public BulwarkDiamond(Properties p_i48470_1_) {
        super(p_i48470_1_);
    }

    @Override
    public boolean isValidRepairItem(ItemStack pToRepair, ItemStack pRepair) {
        return pRepair.getItem() == Items.DIAMOND || super.isValidRepairItem(pToRepair, pRepair);
    }
}