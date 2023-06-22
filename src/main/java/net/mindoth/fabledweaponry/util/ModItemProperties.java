package net.mindoth.fabledweaponry.util;

import net.mindoth.fabledweaponry.registries.FabledWeaponryItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemModelsProperties;
import net.minecraft.util.ResourceLocation;

public class ModItemProperties {

    public static void addCustomItemProperties() {
        makeBow(FabledWeaponryItems.LONGBOW.get());
        makeBow(FabledWeaponryItems.LONGBOW_LEATHER.get());
        makeBow(FabledWeaponryItems.LONGBOW_IRON.get());
        makeBow(FabledWeaponryItems.LONGBOW_GOLD.get());
        makeBow(FabledWeaponryItems.LONGBOW_DIAMOND.get());
        makeBow(FabledWeaponryItems.LONGBOW_NETHERITE.get());
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
}
