package net.mindoth.fabledweaponry.util;

import net.mindoth.fabledweaponry.FabledWeaponry;
import net.mindoth.fabledweaponry.registries.FabledWeaponryItems;
import net.minecraft.item.*;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;

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
        ItemModelsProperties.register(item, new ResourceLocation("blocking"), (p_239421_0_, p_239421_1_, p_239421_2_) -> {
            return p_239421_2_ != null && p_239421_2_.isUsingItem() && p_239421_2_.getUseItem() == p_239421_0_ ? 1.0F : 0.0F;
        });
    }

    public static void makeBow(Item item) {
        ItemModelsProperties.register(item, new ResourceLocation("pull"), (p_239429_0_, p_239429_1_, p_239429_2_) -> {
            if (p_239429_2_ == null) {
                return 0.0F;
            }
            else {
                return p_239429_2_.getUseItem() != p_239429_0_ ? 0.0F : (float)(p_239429_0_.getUseDuration() -
                        p_239429_2_.getUseItemRemainingTicks()) / 40.0F;
            }
        });

        ItemModelsProperties.register(item, new ResourceLocation("pulling"), (p_239428_0_, p_239428_1_, p_239428_2_) -> {
            return p_239428_2_ != null && p_239428_2_.isUsingItem() && p_239428_2_.getUseItem() == p_239428_0_ ? 1.0F : 0.0F;
        });
    }

    public static void makeCrossbow(Item item) {
        ItemModelsProperties.register(item, new ResourceLocation("pull"), (p_239427_0_, p_239427_1_, p_239427_2_) -> {
            if (p_239427_2_ == null) {
                return 0.0F;
            } else {
                return CrossbowItem.isCharged(p_239427_0_) ? 0.0F : (float)(p_239427_0_.getUseDuration() - p_239427_2_.getUseItemRemainingTicks()) / (float)CrossbowItem.getChargeDuration(p_239427_0_);
            }
        });
        ItemModelsProperties.register(item, new ResourceLocation("pulling"), (p_239426_0_, p_239426_1_, p_239426_2_) -> {
            return p_239426_2_ != null && p_239426_2_.isUsingItem() && p_239426_2_.getUseItem() == p_239426_0_ && !CrossbowItem.isCharged(p_239426_0_) ? 1.0F : 0.0F;
        });
        ItemModelsProperties.register(item, new ResourceLocation("charged"), (p_239425_0_, p_239425_1_, p_239425_2_) -> {
            return p_239425_2_ != null && CrossbowItem.isCharged(p_239425_0_) ? 1.0F : 0.0F;
        });
        ItemModelsProperties.register(item, new ResourceLocation("firework"), (p_239424_0_, p_239424_1_, p_239424_2_) -> {
            return p_239424_2_ != null && CrossbowItem.isCharged(p_239424_0_) && CrossbowItem.containsChargedProjectile(p_239424_0_, Items.FIREWORK_ROCKET) ? 1.0F : 0.0F;
        });
    }
}
