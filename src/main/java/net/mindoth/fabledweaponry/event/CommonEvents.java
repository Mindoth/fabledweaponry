package net.mindoth.fabledweaponry.event;

import net.mindoth.fabledweaponry.FabledWeaponry;
import net.mindoth.fabledweaponry.item.*;
import net.mindoth.fabledweaponry.registries.FabledWeaponryItems;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingHealEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = FabledWeaponry.MOD_ID)
public class CommonEvents {

    public static boolean isMeleeAttack(DamageSource source) {
        return source.getEntity() == source.getDirectEntity()
                && !source.isIndirect()
                && !source.is(DamageTypes.THORNS);
    }

    @SubscribeEvent
    public static void greatswordEffect(final LivingDamageEvent event) {
        //Check that its melee damage
        if ( event.getSource().getDirectEntity() instanceof LivingEntity && event.getSource().getEntity() instanceof LivingEntity ) {
            LivingEntity source = (LivingEntity) event.getSource().getEntity();
            LivingEntity target = event.getEntity();
            Level level = target.level();
            float amount = event.getAmount();

            if ( !level.isClientSide ) {
                if ( (source.getItemBySlot(EquipmentSlot.MAINHAND).getItem() instanceof GreatswordItem && source.getItemBySlot(EquipmentSlot.OFFHAND).isEmpty()) || (source.getItemBySlot(EquipmentSlot.OFFHAND).getItem() instanceof GreatswordItem && source.getItemBySlot(EquipmentSlot.MAINHAND).isEmpty()) ) {
                    Item handItem;
                    if ( source.getItemBySlot(EquipmentSlot.MAINHAND).getItem() instanceof GreatswordItem ) {
                        handItem = source.getItemBySlot(EquipmentSlot.MAINHAND).getItem();
                    }
                    else {
                        handItem = source.getItemBySlot(EquipmentSlot.OFFHAND).getItem();
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
                if ( (target.getItemBySlot(EquipmentSlot.MAINHAND).getItem() instanceof GreatswordItem && target.getItemBySlot(EquipmentSlot.OFFHAND).isEmpty()) || (target.getItemBySlot(EquipmentSlot.OFFHAND).getItem() instanceof GreatswordItem && target.getItemBySlot(EquipmentSlot.MAINHAND).isEmpty()) ) {
                    Item handItem;
                    if ( target.getItemBySlot(EquipmentSlot.MAINHAND).getItem() instanceof GreatswordItem ) {
                        handItem = target.getItemBySlot(EquipmentSlot.MAINHAND).getItem();
                    }
                    else {
                        handItem = target.getItemBySlot(EquipmentSlot.OFFHAND).getItem();
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
            LivingEntity target = event.getEntity();
            Level level = target.level();
            float amount = event.getAmount();

            if ( !level.isClientSide ) {
                if ( source.getItemBySlot(EquipmentSlot.MAINHAND).getItem() instanceof WaraxeItem ) {
                    Item handItem;
                    if ( source.getItemBySlot(EquipmentSlot.MAINHAND).getItem() instanceof WaraxeItem ) {
                        handItem = source.getItemBySlot(EquipmentSlot.MAINHAND).getItem();
                    }
                    else {
                        handItem = source.getItemBySlot(EquipmentSlot.OFFHAND).getItem();
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
            LivingEntity target = event.getEntity();
            Level level = target.level();
            float amount = event.getAmount();

            if ( !level.isClientSide ) {
                if ( source.getItemBySlot(EquipmentSlot.MAINHAND).getItem() instanceof MaulItem ) {
                    event.setAmount(amount + (float)(target.getBoundingBox().getXsize() + target.getBoundingBox().getYsize() + target.getBoundingBox().getZsize()));
                }
            }
        }
    }

    @SubscribeEvent
    public static void scytheEffect(final LivingHurtEvent event) {
        //Check that its melee damage
        if ( event.getSource().getDirectEntity() instanceof LivingEntity ) {
            LivingEntity source = (LivingEntity) event.getSource().getEntity();
            LivingEntity target = event.getEntity();
            Level level = target.level();
            float amount = event.getAmount();
            if ( !level.isClientSide ) {
                if ( source instanceof Player && isMeleeAttack(event.getSource()) ) {
                    if ( source.getItemBySlot(EquipmentSlot.MAINHAND).getItem() instanceof ScytheItem ) {
                        List<Entity> entitiesAround;
                        entitiesAround = level.getEntities(target, target.getBoundingBox().inflate(2.0D, 0.0D, 2.0D), Entity::isAlive);
                        entitiesAround.remove(target);
                        entitiesAround.removeIf(closeEntities -> closeEntities.isAlliedTo(source));
                        entitiesAround.removeIf(closeEntities -> !(closeEntities instanceof LivingEntity));
                        if ( entitiesAround.size() > 0 ) {
                            event.setAmount(Math.max(1, amount / (entitiesAround.size() + 1)));
                            for ( Entity damageableEntities : entitiesAround ) {
                                damageableEntities.hurt(target.damageSources().noAggroMobAttack(source), Math.max(1, amount / (entitiesAround.size() + 1)));
                            }
                        }
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public static void daggerEffect(final LivingDamageEvent event) {
        //Check that its melee damage
        if ( event.getSource().getDirectEntity() instanceof LivingEntity && event.getSource().getEntity() instanceof LivingEntity ) {
            LivingEntity source = (LivingEntity) event.getSource().getEntity();
            LivingEntity target = event.getEntity();
            Level level = target.level();
            float amount = event.getAmount();
            if ( !level.isClientSide ) {
                if ( source.getItemBySlot(EquipmentSlot.MAINHAND).getItem() instanceof DaggerItem ) {
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
            LivingEntity target = event.getEntity();
            Level level = target.level();

            if ( !level.isClientSide ) {
                if ( source.getItemBySlot(EquipmentSlot.MAINHAND).getItem() instanceof MaceItem ) {
                    if ( source.getItemBySlot(EquipmentSlot.MAINHAND).getItem() instanceof TomeItem || source.getItemBySlot(EquipmentSlot.OFFHAND).getItem() instanceof TomeItem ) {
                        event.setAmount(0);
                        target.hurt(target.damageSources().magic(), event.getAmount());
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public static void aegisEffect(final LivingHealEvent event) {
        LivingEntity livingEntity = event.getEntity();
        Level level = livingEntity.level();
        float amount = event.getAmount();
        if ( !level.isClientSide ) {
            if ( livingEntity.getItemBySlot(EquipmentSlot.MAINHAND).getItem() instanceof AegisItem || livingEntity.getItemBySlot(EquipmentSlot.OFFHAND).getItem() instanceof AegisItem ) {
                Item item;
                if ( livingEntity.getItemBySlot(EquipmentSlot.OFFHAND).getItem() instanceof AegisItem ) {
                    item = livingEntity.getItemBySlot(EquipmentSlot.OFFHAND).getItem();
                }
                else {
                    item = livingEntity.getItemBySlot(EquipmentSlot.MAINHAND).getItem();
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

    private static boolean checkCooldown(Player player, Item item) {
        return player.getCooldowns().getCooldownPercent(item, 0) > 0;
    }

    private static void removeCooldown(Player player, Item item) {
        player.getCooldowns().addCooldown(item, -Integer.MAX_VALUE);
    }

    private static void handleBulwarkEffect(Player player) {
        if ( checkCooldown(player, FabledWeaponryItems.BULWARK_WOOD.get()) ) {
            removeCooldown(player, FabledWeaponryItems.BULWARK_WOOD.get());
        }
        if ( checkCooldown(player, FabledWeaponryItems.BULWARK_LEATHER.get()) ) {
            removeCooldown(player, FabledWeaponryItems.BULWARK_LEATHER.get());
        }
        if ( checkCooldown(player, FabledWeaponryItems.BULWARK_IRON.get()) ) {
            removeCooldown(player, FabledWeaponryItems.BULWARK_IRON.get());
        }
        if ( checkCooldown(player, FabledWeaponryItems.BULWARK_GOLD.get()) ) {
            removeCooldown(player, FabledWeaponryItems.BULWARK_GOLD.get());
        }
        if ( checkCooldown(player, FabledWeaponryItems.BULWARK_DIAMOND.get()) ) {
            removeCooldown(player, FabledWeaponryItems.BULWARK_DIAMOND.get());
        }
        if ( checkCooldown(player, FabledWeaponryItems.BULWARK_NETHERITE.get()) ) {
            removeCooldown(player, FabledWeaponryItems.BULWARK_NETHERITE.get());
        }
    }

    @SubscribeEvent
    public static void bulwarkEffect(TickEvent.PlayerTickEvent event) {
        Player player = event.player;
        handleBulwarkEffect(player);
    }

    @SubscribeEvent
    public static void tomeEffect(final LivingDamageEvent event) {
        if ( event.getSource().getEntity() instanceof LivingEntity ) {
            LivingEntity source = (LivingEntity)event.getSource().getEntity();
            LivingEntity target = event.getEntity();
            Level level = target.level();
            float amount = event.getAmount();
            if ( !level.isClientSide ) {
                if ( source.getItemBySlot(EquipmentSlot.MAINHAND).getItem() instanceof TomeItem || source.getItemBySlot(EquipmentSlot.OFFHAND).getItem() instanceof TomeItem ) {
                    Item item;
                    if ( source.getItemBySlot(EquipmentSlot.OFFHAND).getItem() instanceof TomeItem ) {
                        item = source.getItemBySlot(EquipmentSlot.OFFHAND).getItem();
                    }
                    else {
                        item = source.getItemBySlot(EquipmentSlot.MAINHAND).getItem();
                    }
                    if ( event.getSource().is(DamageTypes.MAGIC) || event.getSource().is(DamageTypes.INDIRECT_MAGIC) ) {
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
