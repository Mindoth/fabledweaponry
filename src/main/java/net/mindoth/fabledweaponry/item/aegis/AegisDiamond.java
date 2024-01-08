package net.mindoth.fabledweaponry.item.aegis;

import net.mindoth.fabledweaponry.item.AegisItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class AegisDiamond extends AegisItem {
    public AegisDiamond(Properties p_i48470_1_) {
        super(p_i48470_1_);
    }

    @Override
    public boolean isValidRepairItem(ItemStack pToRepair, ItemStack pRepair) {
        return pRepair.getItem() == Items.DIAMOND || super.isValidRepairItem(pToRepair, pRepair);
    }
}
