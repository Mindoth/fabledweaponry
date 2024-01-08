package net.mindoth.fabledweaponry.item.bulwark;

import net.mindoth.fabledweaponry.item.BulwarkItem;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ItemStack;

public class BulwarkWood extends BulwarkItem {
    public BulwarkWood(Properties p_i48470_1_) {
        super(p_i48470_1_);
    }

    @Override
    public boolean isValidRepairItem(ItemStack pToRepair, ItemStack pRepair) {
        return pRepair.is(ItemTags.PLANKS) || super.isValidRepairItem(pToRepair, pRepair);
    }
}
