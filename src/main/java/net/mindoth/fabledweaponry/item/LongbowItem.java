package net.mindoth.fabledweaponry.item;

import net.minecraft.world.item.BowItem;

public class LongbowItem extends BowItem {

    public LongbowItem(Properties p_i48522_1_) {
        super(p_i48522_1_);
    }

    public static float getLongPowerForTime(int pCharge) {
        float f = (float)pCharge / 40.0F;
        f = (f * f + f * 2.0F) / 3.0F;
        if (f > 1.0F) {
            f = 1.0F;
        }

        return f;
    }
}
