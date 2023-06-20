package net.mindoth.fabledweaponry.event;

import net.mindoth.fabledweaponry.FabledWeaponry;
import net.mindoth.fabledweaponry.item.*;
import net.mindoth.fabledweaponry.registries.FabledWeaponryItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = FabledWeaponry.MOD_ID)
public class CommonEvents {

    //TODO Maybe use sweep particle and sound to all enemies around?
/*
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
*/
    @SubscribeEvent
    public static void greatswordEffect(final LivingDamageEvent event) {
        //Check that its melee damage
        if ( event.getSource().getDirectEntity() instanceof LivingEntity ) {
            LivingEntity source = (LivingEntity) event.getSource().getEntity();
            LivingEntity target = event.getEntityLiving();
            World level = source.level;
            float amount = event.getAmount();

            if ( !level.isClientSide ) {
                if ( (source.getItemBySlot(EquipmentSlotType.MAINHAND).getItem() instanceof GreatswordItem && source.getItemBySlot(EquipmentSlotType.OFFHAND).isEmpty()) || (source.getItemBySlot(EquipmentSlotType.OFFHAND).getItem() instanceof GreatswordItem && source.getItemBySlot(EquipmentSlotType.MAINHAND).isEmpty()) ) {
                    Item handItem;
                    if ( source.getItemBySlot(EquipmentSlotType.MAINHAND).getItem() instanceof GreatswordItem ) {
                        handItem = source.getItemBySlot(EquipmentSlotType.MAINHAND).getItem();
                    }
                    else {
                        handItem = source.getItemBySlot(EquipmentSlotType.OFFHAND).getItem();
                    }
                    if (handItem == FabledWeaponryItems.GREATSWORD_WOOD.get() || handItem == FabledWeaponryItems.GREATSWORD_GOLD.get()) {
                        event.setAmount(amount * 1.20f);
                    }
                    if (handItem == FabledWeaponryItems.GREATSWORD_STONE.get()) {
                        event.setAmount(amount * 1.25f);
                    }
                    if (handItem == FabledWeaponryItems.GREATSWORD_IRON.get()) {
                        event.setAmount(amount * 1.30f);
                    }
                    if (handItem == FabledWeaponryItems.GREATSWORD_DIAMOND.get()) {
                        event.setAmount(amount * 1.35f);
                    }
                    if (handItem == FabledWeaponryItems.GREATSWORD_NETHERITE.get()) {
                        event.setAmount(amount * 1.40f);
                    }
                }
                if ( (target.getItemBySlot(EquipmentSlotType.MAINHAND).getItem() instanceof GreatswordItem && target.getItemBySlot(EquipmentSlotType.OFFHAND).isEmpty()) || (target.getItemBySlot(EquipmentSlotType.OFFHAND).getItem() instanceof GreatswordItem && target.getItemBySlot(EquipmentSlotType.MAINHAND).isEmpty()) ) {
                    Item handItem;
                    if ( target.getItemBySlot(EquipmentSlotType.MAINHAND).getItem() instanceof GreatswordItem ) {
                        handItem = target.getItemBySlot(EquipmentSlotType.MAINHAND).getItem();
                    }
                    else {
                        handItem = target.getItemBySlot(EquipmentSlotType.OFFHAND).getItem();
                    }
                    if (handItem == FabledWeaponryItems.GREATSWORD_WOOD.get() || handItem == FabledWeaponryItems.GREATSWORD_GOLD.get()) {
                        event.setAmount(amount * 0.80f);
                    }
                    if (handItem == FabledWeaponryItems.GREATSWORD_STONE.get()) {
                        event.setAmount(amount * 0.75f);
                    }
                    if (handItem == FabledWeaponryItems.GREATSWORD_IRON.get()) {
                        event.setAmount(amount * 0.70f);
                    }
                    if (handItem == FabledWeaponryItems.GREATSWORD_DIAMOND.get()) {
                        event.setAmount(amount * 0.65f);
                    }
                    if (handItem == FabledWeaponryItems.GREATSWORD_NETHERITE.get()) {
                        event.setAmount(amount * 0.60f);
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public static void waraxeEffect(final LivingDamageEvent event) {
        //Check that its melee damage
        if ( event.getSource().getDirectEntity() instanceof LivingEntity ) {
            LivingEntity source = (LivingEntity) event.getSource().getEntity();
            LivingEntity target = event.getEntityLiving();
            World level = source.level;
            float amount = event.getAmount();

            if ( !level.isClientSide ) {
                if ( source.getItemBySlot(EquipmentSlotType.MAINHAND).getItem() instanceof WaraxeItem ) {
                    Item handItem;
                    if ( source.getItemBySlot(EquipmentSlotType.MAINHAND).getItem() instanceof WaraxeItem ) {
                        handItem = source.getItemBySlot(EquipmentSlotType.MAINHAND).getItem();
                    }
                    else {
                        handItem = source.getItemBySlot(EquipmentSlotType.OFFHAND).getItem();
                    }
                    if (handItem == FabledWeaponryItems.WARAXE_WOOD.get() || handItem == FabledWeaponryItems.WARAXE_GOLD.get()) {
                        if ( source.getHealth() <= source.getMaxHealth() * 0.25 ) {
                            event.setAmount(amount * 2.00f);
                        }
                        else if ( source.getHealth() <= source.getMaxHealth() * 0.50 ) {
                            event.setAmount(amount * 1.50f);
                        }
                        else if ( source.getHealth() <= source.getMaxHealth() * 0.75 ) {
                            event.setAmount(amount * 1.25f);
                        }
                    }
                    if (handItem == FabledWeaponryItems.WARAXE_STONE.get()) {
                        if ( source.getHealth() <= source.getMaxHealth() * 0.25 ) {
                            event.setAmount(amount * 2.50f);
                        }
                        else if ( source.getHealth() <= source.getMaxHealth() * 0.50 ) {
                            event.setAmount(amount * 1.75f);
                        }
                        else if ( source.getHealth() <= source.getMaxHealth() * 0.75 ) {
                            event.setAmount(amount * 1.375f);
                        }
                    }
                    if (handItem == FabledWeaponryItems.WARAXE_IRON.get()) {
                        if ( source.getHealth() <= source.getMaxHealth() * 0.25 ) {
                            event.setAmount(amount * 3.00f);
                        }
                        else if ( source.getHealth() <= source.getMaxHealth() * 0.50 ) {
                            event.setAmount(amount * 2.00f);
                        }
                        else if ( source.getHealth() <= source.getMaxHealth() * 0.75 ) {
                            event.setAmount(amount * 1.50f);
                        }
                    }
                    if (handItem == FabledWeaponryItems.WARAXE_DIAMOND.get()) {
                        if ( source.getHealth() <= source.getMaxHealth() * 0.25 ) {
                            event.setAmount(amount * 3.50f);
                        }
                        else if ( source.getHealth() <= source.getMaxHealth() * 0.50 ) {
                            event.setAmount(amount * 2.25f);
                        }
                        else if ( source.getHealth() <= source.getMaxHealth() * 0.75 ) {
                            event.setAmount(amount * 1.625f);
                        }
                    }
                    if (handItem == FabledWeaponryItems.WARAXE_NETHERITE.get()) {
                        if ( source.getHealth() <= source.getMaxHealth() * 0.25 ) {
                            event.setAmount(amount * 4.00f);
                        }
                        else if ( source.getHealth() <= source.getMaxHealth() * 0.50 ) {
                            event.setAmount(amount * 2.50f);
                        }
                        else if ( source.getHealth() <= source.getMaxHealth() * 0.75 ) {
                            event.setAmount(amount * 1.75f);
                        }
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public static void maulEffect(final LivingDamageEvent event) {
        //Check that its melee damage
        if ( event.getSource().getDirectEntity() instanceof LivingEntity ) {
            LivingEntity source = (LivingEntity) event.getSource().getEntity();
            LivingEntity target = event.getEntityLiving();
            World level = target.level;
            float amount = event.getAmount();

            if ( !level.isClientSide ) {
                if ( source.getItemBySlot(EquipmentSlotType.MAINHAND).getItem() instanceof MaulItem ) {
                    event.setAmount(amount + (float)(target.getBoundingBox().getXsize() + target.getBoundingBox().getYsize() + target.getBoundingBox().getZsize()));
                }
            }
        }
    }

    private static final String TAG_SCYTHE_COOLDOWN = ("scytheCooldown");

    @SubscribeEvent
    public static void scytheEffect(final LivingDamageEvent event) {
        //Check that its melee damage
        if ( event.getSource().getDirectEntity() instanceof LivingEntity ) {
            LivingEntity source = (LivingEntity) event.getSource().getEntity();
            LivingEntity target = event.getEntityLiving();
            World level = target.level;
            float amount = event.getAmount();
            CompoundNBT playerData = source.getPersistentData();
            CompoundNBT data = playerData.getCompound(PlayerEntity.PERSISTED_NBT_TAG);

            if ( !data.getBoolean(TAG_SCYTHE_COOLDOWN) ) {
                data.putBoolean(TAG_SCYTHE_COOLDOWN, true);
                if ( !level.isClientSide ) {
                    if ( source.getItemBySlot(EquipmentSlotType.MAINHAND).getItem() instanceof ScytheItem ) {
                        List<Entity> entitiesAround;
                        entitiesAround = level.getEntities(target, target.getBoundingBox().inflate(2.0D, 0.0D, 2.0D), Entity::isAlive);
                        entitiesAround.remove(target);
                        entitiesAround.removeIf(closeEntities -> closeEntities.isAlliedTo(source));
                        entitiesAround.removeIf(closeEntities -> !(closeEntities.getEntity() instanceof LivingEntity));
                        if ( entitiesAround.size() > 0 ) {
                            event.setAmount(Math.max(1, amount / (entitiesAround.size() + 1)));
                            for ( Entity damageableEntities : entitiesAround ) {
                                damageableEntities.hurt(event.getSource(), Math.max(1, amount / (entitiesAround.size() + 1)));
                                //ServerWorld world = (ServerWorld) target.level;
                                //world.sendParticles(ParticleTypes.SWEEP_ATTACK, damageableEntities.getX(), damageableEntities.getBbHeight() / 2, damageableEntities.getZ(), 1, 0, 0, 0, 0);
                            }
                        }
                    }
                }
                data.putBoolean(TAG_SCYTHE_COOLDOWN, false);
            }
        }
    }

    @SubscribeEvent
    public static void daggerEffect(final LivingDamageEvent event) {
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
