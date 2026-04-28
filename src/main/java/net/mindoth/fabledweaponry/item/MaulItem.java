package net.mindoth.fabledweaponry.item;

import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;

public class MaulItem extends SwordItem {
    public MaulItem(Tiers tier, int attackDamageModifier, float attackSpeedModifier, Properties properties) {
        super(tier, properties.attributes(SwordItem.createAttributes(tier, attackDamageModifier, attackSpeedModifier)));
    }
}
