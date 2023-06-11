package net.mindoth.fabledweaponry.event;

import net.mindoth.fabledweaponry.FabledWeaponry;
import net.mindoth.fabledweaponry.item.DaggerItem;
import net.mindoth.fabledweaponry.item.ScytheItem;
import net.mindoth.fabledweaponry.registries.FabledWeaponryItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = FabledWeaponry.MOD_ID)
public class CommonEvents {

    //TODO Maybe use sweep particle and sound to all enemies around?

    @SubscribeEvent
    public static void scytheSpin(final LivingDamageEvent event) {
        //Check that its melee damage
        if ( event.getSource().getDirectEntity() instanceof LivingEntity ) {
            LivingEntity source = (LivingEntity) event.getSource().getEntity();
            LivingEntity target = event.getEntityLiving();
            World level = target.level;
            float amount = event.getAmount();

            if ( !level.isClientSide ) {
                if ( source.getItemBySlot(EquipmentSlotType.MAINHAND).getItem() instanceof ScytheItem ) {
                    double range = source.distanceTo(target);
                    List<Entity> entitiesAround = level.getEntities(source, source.getBoundingBox().inflate(range, 0.0D, range));

                    for (Entity listedEntity : entitiesAround) {
                        if (source.canAttack(target) && !source.isAlliedTo(target)) {
                            listedEntity.hurt(event.getSource(), amount);
                        }
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public static void daggerBonus(final LivingDamageEvent event) {
        //Check that its melee damage
        if ( event.getSource().getDirectEntity() instanceof LivingEntity ) {
            LivingEntity source = (LivingEntity) event.getSource().getEntity();
            LivingEntity target = event.getEntityLiving();
            World level = target.level;
            float amount = event.getAmount();

            if ( !level.isClientSide ) {
                if ( source.getItemBySlot(EquipmentSlotType.MAINHAND).getItem() instanceof DaggerItem ) {
                    double range = source.distanceTo(target);
                    event.setAmount(Math.max(amount, amount + (8 - ((float)range) * 2)) );
                    System.out.println(Math.max(amount, amount + (8 - ((float)range) * 2)));
                }
            }
        }
    }
}
