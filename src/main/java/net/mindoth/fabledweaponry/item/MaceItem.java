package net.mindoth.fabledweaponry.item;

import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class MaceItem extends SwordItem {
    public MaceItem(IItemTier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }
}
