package net.mindoth.fabledweaponry.item;

import net.mindoth.fabledweaponry.FabledWeaponry;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.event.ItemAttributeModifierEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FabledWeaponry.MOD_ID)
public class ScimitarItem extends SwordItem {
    public ScimitarItem(Tiers pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @SubscribeEvent
    public static void scmitarEffect(ItemAttributeModifierEvent event) {
        ItemStack stack = event.getItemStack();
        Item item = stack.getItem();

        if ( item instanceof ScimitarItem && event.getSlotType() == EquipmentSlot.MAINHAND ) {
            if ( stack.getDamageValue() >= stack.getMaxDamage() * 0.75 ) {
                event.removeAttribute(Attributes.ATTACK_SPEED);
                event.addModifier(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Weapon modifier", -1.2 - 0.3, AttributeModifier.Operation.ADDITION));
            }
            else if ( stack.getDamageValue() >= stack.getMaxDamage() * 0.50 ) {
                event.removeAttribute(Attributes.ATTACK_SPEED);
                event.addModifier(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Weapon modifier", -1.2 - 0.6, AttributeModifier.Operation.ADDITION));
            }
            else if ( stack.getDamageValue() >= stack.getMaxDamage() * 0.25 ) {
                event.removeAttribute(Attributes.ATTACK_SPEED);
                event.addModifier(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Weapon modifier", -1.2 - 0.9, AttributeModifier.Operation.ADDITION));
            }
        }
    }
}
