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
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingHealEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = FabledWeaponry.MOD_ID)
public class CommonEvents {

    private static final String TAG_SCYTHE_COOLDOWN = ("scytheCooldown");

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
        if ( event.getSource().getDirectEntity() instanceof LivingEntity && event.getSource().getEntity() instanceof LivingEntity ) {
            LivingEntity source = (LivingEntity) event.getSource().getEntity();
            LivingEntity target = event.getEntityLiving();
            World level = target.level;
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
        if ( event.getSource().getDirectEntity() instanceof LivingEntity && event.getSource().getEntity() instanceof LivingEntity ) {
            LivingEntity source = (LivingEntity) event.getSource().getEntity();
            LivingEntity target = event.getEntityLiving();
            World level = target.level;
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
        if ( event.getSource().getDirectEntity() instanceof LivingEntity && event.getSource().getEntity() instanceof LivingEntity ) {
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

    @SubscribeEvent
    public static void scytheEffect(final LivingDamageEvent event) {
        //Check that its melee damage
        if ( event.getSource().getDirectEntity() instanceof LivingEntity ) {
            LivingEntity source = (LivingEntity) event.getSource().getEntity();
            LivingEntity target = event.getEntityLiving();
            World level = target.level;
            float amount = event.getAmount();
            if ( source instanceof PlayerEntity ) {
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
    }

    @SubscribeEvent
    public static void daggerEffect(final LivingDamageEvent event) {
        //Check that its melee damage
        if ( event.getSource().getDirectEntity() instanceof LivingEntity && event.getSource().getEntity() instanceof LivingEntity  ) {
            LivingEntity source = (LivingEntity) event.getSource().getEntity();
            LivingEntity target = event.getEntityLiving();
            World level = target.level;
            float amount = event.getAmount();
            if ( !level.isClientSide ) {
                if ( source.getItemBySlot(EquipmentSlotType.MAINHAND).getItem() instanceof DaggerItem ) {
                    double range = source.distanceTo(target);
                    event.setAmount(Math.max(amount, amount + (8 - ((float)range) * 2)) );
                }
            }
        }
    }

    @SubscribeEvent
    public static void maceEffect(final LivingHurtEvent event) {
        //Check that its melee damage
        if (event.getSource().getDirectEntity() instanceof LivingEntity && event.getSource().getEntity() instanceof LivingEntity) {
            LivingEntity source = (LivingEntity) event.getSource().getEntity();
            LivingEntity target = event.getEntityLiving();
            World level = target.level;

            if ( !level.isClientSide ) {
                if ( source.getItemBySlot(EquipmentSlotType.MAINHAND).getItem() instanceof MaceItem ) {
                    if ( source.getItemBySlot(EquipmentSlotType.MAINHAND).getItem() instanceof TomeItem || source.getItemBySlot(EquipmentSlotType.OFFHAND).getItem() instanceof TomeItem ) {
                        event.getSource().setMagic().bypassArmor();
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public static void aegisEffect(final LivingHealEvent event) {
        LivingEntity livingEntity = event.getEntityLiving();
        World level = livingEntity.level;
        float amount = event.getAmount();
        if ( !level.isClientSide ) {
            if ( livingEntity.getItemBySlot(EquipmentSlotType.MAINHAND).getItem() instanceof AegisItem || livingEntity.getItemBySlot(EquipmentSlotType.OFFHAND).getItem() instanceof AegisItem ) {
                Item item;
                if ( livingEntity.getItemBySlot(EquipmentSlotType.OFFHAND).getItem() instanceof AegisItem ) {
                    item = livingEntity.getItemBySlot(EquipmentSlotType.OFFHAND).getItem();
                }
                else {
                    item = livingEntity.getItemBySlot(EquipmentSlotType.MAINHAND).getItem();
                }
                if ( item == FabledWeaponryItems.AEGIS_WOOD.get() ) {
                    event.setAmount(amount * 1.10f);
                }
                else if ( item == FabledWeaponryItems.AEGIS_LEATHER.get() ) {
                    event.setAmount(amount * 1.20f);
                }
                else if ( item == FabledWeaponryItems.AEGIS_IRON.get() ) {
                    event.setAmount(amount * 1.30f);
                }
                else if ( item == FabledWeaponryItems.AEGIS_GOLD.get() ) {
                    event.setAmount(amount * 1.10f);
                }
                else if ( item == FabledWeaponryItems.AEGIS_DIAMOND.get() ) {
                    event.setAmount(amount * 1.40f);
                }
                else if ( item == FabledWeaponryItems.AEGIS_NETHERITE.get() ) {
                    event.setAmount(amount * 1.50f);
                }
            }
        }
    }

    @SubscribeEvent
    public static void bulwarkEffect(final TickEvent.PlayerTickEvent event) {
        PlayerEntity player = event.player;
        World level = player.level;
        if ( !level.isClientSide ) {
            if ( player.getCooldowns().getCooldownPercent(FabledWeaponryItems.BULWARK_WOOD.get(), 0) >= 0.1F ) {
                player.getCooldowns().removeCooldown(FabledWeaponryItems.BULWARK_WOOD.get());
                player.getCooldowns().addCooldown(FabledWeaponryItems.BULWARK_WOOD.get(), 1);
            }
            if ( player.getCooldowns().getCooldownPercent(FabledWeaponryItems.BULWARK_LEATHER.get(), 0) >= 0.1F ) {
                player.getCooldowns().removeCooldown(FabledWeaponryItems.BULWARK_LEATHER.get());
                player.getCooldowns().addCooldown(FabledWeaponryItems.BULWARK_LEATHER.get(), 1);
            }
            if ( player.getCooldowns().getCooldownPercent(FabledWeaponryItems.BULWARK_IRON.get(), 0) >= 0.1F ) {
                player.getCooldowns().removeCooldown(FabledWeaponryItems.BULWARK_IRON.get());
                player.getCooldowns().addCooldown(FabledWeaponryItems.BULWARK_IRON.get(), 1);
            }
            if ( player.getCooldowns().getCooldownPercent(FabledWeaponryItems.BULWARK_GOLD.get(), 0) >= 0.1F ) {
                player.getCooldowns().removeCooldown(FabledWeaponryItems.BULWARK_GOLD.get());
                player.getCooldowns().addCooldown(FabledWeaponryItems.BULWARK_GOLD.get(), 1);
            }
            if ( player.getCooldowns().getCooldownPercent(FabledWeaponryItems.BULWARK_DIAMOND.get(), 0) >= 0.1F ) {
                player.getCooldowns().removeCooldown(FabledWeaponryItems.BULWARK_DIAMOND.get());
                player.getCooldowns().addCooldown(FabledWeaponryItems.BULWARK_DIAMOND.get(), 1);
            }
            if ( player.getCooldowns().getCooldownPercent(FabledWeaponryItems.BULWARK_NETHERITE.get(), 0) >= 0.1F ) {
                player.getCooldowns().removeCooldown(FabledWeaponryItems.BULWARK_NETHERITE.get());
                player.getCooldowns().addCooldown(FabledWeaponryItems.BULWARK_NETHERITE.get(), 1);
            }
        }
    }

    @SubscribeEvent
    public static void tomeEffect(final LivingDamageEvent event) {
        if ( event.getSource().getEntity() instanceof LivingEntity ) {
            LivingEntity source = (LivingEntity) event.getSource().getEntity();
            LivingEntity target = event.getEntityLiving();
            World level = target.level;
            float amount = event.getAmount();
            if ( !level.isClientSide ) {
                if ( source.getItemBySlot(EquipmentSlotType.MAINHAND).getItem() instanceof TomeItem || source.getItemBySlot(EquipmentSlotType.OFFHAND).getItem() instanceof TomeItem ) {
                    Item item;
                    if ( source.getItemBySlot(EquipmentSlotType.OFFHAND).getItem() instanceof TomeItem ) {
                        item = source.getItemBySlot(EquipmentSlotType.OFFHAND).getItem();
                    }
                    else {
                        item = source.getItemBySlot(EquipmentSlotType.MAINHAND).getItem();
                    }
                    if ( event.getSource().isMagic() ) {
                        if ( item == FabledWeaponryItems.TOME_LEATHER.get() ) {
                            event.setAmount(amount * 1.10f);
                        }
                        else if ( item == FabledWeaponryItems.TOME_IRON.get() ) {
                            event.setAmount(amount * 1.20f);
                        }
                        else if ( item == FabledWeaponryItems.TOME_GOLD.get() ) {
                            event.setAmount(amount * 1.30f);
                        }
                        else if ( item == FabledWeaponryItems.TOME_DIAMOND.get() ) {
                            event.setAmount(amount * 1.40f);
                        }
                        else if ( item == FabledWeaponryItems.TOME_NETHERITE.get() ) {
                            event.setAmount(amount * 1.50f);
                        }
                    }
                }
            }
        }
    }
}
