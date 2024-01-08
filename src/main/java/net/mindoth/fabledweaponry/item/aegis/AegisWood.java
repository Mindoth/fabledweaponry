package net.mindoth.fabledweaponry.item.aegis;

import net.mindoth.fabledweaponry.item.AegisItem;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ItemStack;

public class AegisWood extends AegisItem {
    public AegisWood(Properties p_i48470_1_) {
        super(p_i48470_1_);
    }

    @Override
    public boolean isValidRepairItem(ItemStack pToRepair, ItemStack pRepair) {
        return pRepair.is(ItemTags.PLANKS) || super.isValidRepairItem(pToRepair, pRepair);
    }
}
