package net.mindoth.fabledweaponry.item.bulwark;

import net.mindoth.fabledweaponry.item.BulwarkItem;
import net.minecraft.item.ItemStack;
import net.minecraft.tags.ItemTags;

public class BulwarkWood extends BulwarkItem {
    public BulwarkWood(Properties p_i48470_1_) {
        super(p_i48470_1_);
    }

    @Override
    public boolean isValidRepairItem(ItemStack pToRepair, ItemStack pRepair) {
        return ItemTags.PLANKS.contains(pRepair.getItem()) || super.isValidRepairItem(pToRepair, pRepair);
    }
}
