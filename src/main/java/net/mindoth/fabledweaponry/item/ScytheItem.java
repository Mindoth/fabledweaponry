package net.mindoth.fabledweaponry.item;

import net.mindoth.fabledweaponry.FabledWeaponry;
import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.common.Mod;

public class ScytheItem extends SwordItem {
    public ScytheItem(IItemTier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }
}
