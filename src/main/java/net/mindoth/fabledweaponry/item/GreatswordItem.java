package net.mindoth.fabledweaponry.item;

import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;

public class GreatswordItem extends SwordItem {
    public GreatswordItem(Tiers tier, int attackDamageModifier, float attackSpeedModifier, Properties properties) {
        super(tier, properties.attributes(SwordItem.createAttributes(tier, attackDamageModifier, attackSpeedModifier)));
    }
}
