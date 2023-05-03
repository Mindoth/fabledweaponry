package net.mindoth.fabledweaponry.event;

import net.mindoth.fabledweaponry.FabledWeaponry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = FabledWeaponry.MOD_ID)
public class CommonEvents {

    @SubscribeEvent
    public static void scytheSpin(final LivingDamageEvent event) {
        //Check that its melee damage
        if ( event.getSource().getDirectEntity() instanceof LivingEntity ) {
            LivingEntity source = (LivingEntity) event.getSource().getEntity();
            LivingEntity target = event.getEntityLiving();
            World level = target.level;
            float amount = event.getAmount();

            if (!level.isClientSide) {
                double range = source.distanceTo(target);
                List<Entity> entitiesAround = level.getEntities(source, source.getBoundingBox().inflate(range, 0.0D, range));

                for ( Entity listedEntity : entitiesAround ) {
                    if ( source.canAttack(target) ) {
                        listedEntity.hurt(event.getSource(), amount);
                    }
                }
            }
        }
    }
}
