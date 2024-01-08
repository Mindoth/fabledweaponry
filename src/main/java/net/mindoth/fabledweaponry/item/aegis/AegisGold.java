package net.mindoth.fabledweaponry.item.aegis;

import net.mindoth.fabledweaponry.item.AegisItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class AegisGold extends AegisItem {
    public AegisGold(Properties p_i48470_1_) {
        super(p_i48470_1_);
    }

    @Override
    public boolean isValidRepairItem(ItemStack pToRepair, ItemStack pRepair) {
        return pRepair.getItem() == Items.GOLD_INGOT || super.isValidRepairItem(pToRepair, pRepair);
    }
}
