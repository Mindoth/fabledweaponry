package net.mindoth.fabledweaponry.util;

import net.mindoth.fabledweaponry.registries.FabledWeaponryItems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.core.component.DataComponents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.ChargedProjectiles;

public class ModItemProperties {

    public static void addCustomItemProperties() {
        makeBow(FabledWeaponryItems.LONGBOW.get());
        makeBow(FabledWeaponryItems.LONGBOW_LEATHER.get());
        makeBow(FabledWeaponryItems.LONGBOW_IRON.get());
        makeBow(FabledWeaponryItems.LONGBOW_GOLD.get());
        makeBow(FabledWeaponryItems.LONGBOW_DIAMOND.get());
        makeBow(FabledWeaponryItems.LONGBOW_NETHERITE.get());
        makeCrossbow(FabledWeaponryItems.BALLISTA.get());
        makeCrossbow(FabledWeaponryItems.BALLISTA_LEATHER.get());
        makeCrossbow(FabledWeaponryItems.BALLISTA_IRON.get());
        makeCrossbow(FabledWeaponryItems.BALLISTA_GOLD.get());
        makeCrossbow(FabledWeaponryItems.BALLISTA_DIAMOND.get());
        makeCrossbow(FabledWeaponryItems.BALLISTA_NETHERITE.get());
        makeShield(FabledWeaponryItems.AEGIS_WOOD.get());
        makeShield(FabledWeaponryItems.AEGIS_LEATHER.get());
        makeShield(FabledWeaponryItems.AEGIS_IRON.get());
        makeShield(FabledWeaponryItems.AEGIS_GOLD.get());
        makeShield(FabledWeaponryItems.AEGIS_DIAMOND.get());
        makeShield(FabledWeaponryItems.AEGIS_NETHERITE.get());
        makeShield(FabledWeaponryItems.BULWARK_WOOD.get());
        makeShield(FabledWeaponryItems.BULWARK_LEATHER.get());
        makeShield(FabledWeaponryItems.BULWARK_IRON.get());
        makeShield(FabledWeaponryItems.BULWARK_GOLD.get());
        makeShield(FabledWeaponryItems.BULWARK_DIAMOND.get());
        makeShield(FabledWeaponryItems.BULWARK_NETHERITE.get());
    }

    public static void makeShield(Item item) {
        ItemProperties.register(item, ResourceLocation.parse("blocking"), (p_239421_0_, p_239421_1_, p_239421_2_, p_174578_) -> {
            return p_239421_2_ != null && p_239421_2_.isUsingItem() && p_239421_2_.getUseItem() == p_239421_0_ ? 1.0F : 0.0F;
        });
    }

    public static void makeBow(Item item) {
        ItemProperties.register(item, ResourceLocation.withDefaultNamespace("pull"), (p_344163_, p_344164_, p_344165_, p_344166_) -> {
            if (p_344165_ == null) {
                return 0.0F;
            } else {
                return p_344165_.getUseItem() != p_344163_ ? 0.0F : (float)(p_344163_.getUseDuration(p_344165_) - p_344165_.getUseItemRemainingTicks()) / 40.0F;
            }
        });
        ItemProperties.register(item, ResourceLocation.withDefaultNamespace("pulling"), (p_174630_, p_174631_, p_174632_, p_174633_) -> {
            return p_174632_ != null && p_174632_.isUsingItem() && p_174632_.getUseItem() == p_174630_ ? 1.0F : 0.0F;
        });
    }

    public static void makeCrossbow(Item item) {
        ItemProperties.register(item, ResourceLocation.withDefaultNamespace("pull"), (p_351682_, p_351683_, p_351684_, p_351685_) -> {
            if (p_351684_ == null) {
                return 0.0F;
            } else {
                return CrossbowItem.isCharged(p_351682_) ? 0.0F : (float)(p_351682_.getUseDuration(p_351684_) - p_351684_.getUseItemRemainingTicks()) / (float)CrossbowItem.getChargeDuration(p_351682_, p_351684_);
            }
        });
        ItemProperties.register(item, ResourceLocation.withDefaultNamespace("pulling"), (p_174605_, p_174606_, p_174607_, p_174608_) -> {
            return p_174607_ != null && p_174607_.isUsingItem() && p_174607_.getUseItem() == p_174605_ && !CrossbowItem.isCharged(p_174605_) ? 1.0F : 0.0F;
        });
        ItemProperties.register(item, ResourceLocation.withDefaultNamespace("charged"), (p_275891_, p_275892_, p_275893_, p_275894_) -> {
            return CrossbowItem.isCharged(p_275891_) ? 1.0F : 0.0F;
        });
        ItemProperties.register(item, ResourceLocation.withDefaultNamespace("firework"), (p_329796_, p_329797_, p_329798_, p_329799_) -> {
            ChargedProjectiles chargedprojectiles = (ChargedProjectiles)p_329796_.get(DataComponents.CHARGED_PROJECTILES);
            return chargedprojectiles != null && chargedprojectiles.contains(Items.FIREWORK_ROCKET) ? 1.0F : 0.0F;
        });
    }
}
