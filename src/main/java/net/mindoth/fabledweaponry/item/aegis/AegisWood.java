package net.mindoth.fabledweaponry.item.aegis;

import net.mindoth.fabledweaponry.item.AegisItem;
import net.minecraft.item.ItemStack;
import net.minecraft.tags.ItemTags;

public class AegisWood extends AegisItem {
    public AegisWood(Properties p_i48470_1_) {
        super(p_i48470_1_);
    }

    @Override
    public boolean isValidRepairItem(ItemStack pToRepair, ItemStack pRepair) {
        return ItemTags.PLANKS.contains(pRepair.getItem()) || super.isValidRepairItem(pToRepair, pRepair);
    }
}
