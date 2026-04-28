package net.mindoth.fabledweaponry.item.longbow;

import net.mindoth.fabledweaponry.item.LongbowItem;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;

public class LongbowWood extends LongbowItem {
    public LongbowWood(Properties p_i48522_1_) {
        super(p_i48522_1_);
    }

    @Override
    protected float velocityMult() {
        return 4.0F;
    }
}
