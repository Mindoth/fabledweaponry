package net.mindoth.fabledweaponry.item;

import net.mindoth.fabledweaponry.FabledWeaponry;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.ItemAttributeModifierEvent;

@EventBusSubscriber(modid = FabledWeaponry.MOD_ID)
public class ScimitarItem extends SwordItem {
    public ScimitarItem(Tiers tier, int attackDamageModifier, float attackSpeedModifier, Properties properties) {
        super(tier, properties.attributes(SwordItem.createAttributes(tier, attackDamageModifier, attackSpeedModifier)));
    }

    @SubscribeEvent
    public static void scimitarEffect(ItemAttributeModifierEvent event) {
        ItemStack stack = event.getItemStack();
        Item item = stack.getItem();

        if ( item instanceof ScimitarItem && stack.getEquipmentSlot() == EquipmentSlot.MAINHAND ) {
            if ( stack.getDamageValue() >= stack.getMaxDamage() * 0.75 ) {
                event.removeModifier(Attributes.ATTACK_SPEED, BASE_ATTACK_SPEED_ID);
                event.addModifier(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_ID, -1.2 - 0.3, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND);
            }
            else if ( stack.getDamageValue() >= stack.getMaxDamage() * 0.50 ) {
                event.removeModifier(Attributes.ATTACK_SPEED, BASE_ATTACK_SPEED_ID);
                event.addModifier(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_ID, -1.2 - 0.6, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND);
            }
            else if ( stack.getDamageValue() >= stack.getMaxDamage() * 0.25 ) {
                event.removeModifier(Attributes.ATTACK_SPEED, BASE_ATTACK_SPEED_ID);
                event.addModifier(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_ID, -1.2 - 0.9, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND);
            }
        }
    }
}
