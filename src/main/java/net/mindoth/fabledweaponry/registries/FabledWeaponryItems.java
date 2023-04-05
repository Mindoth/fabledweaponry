package net.mindoth.fabledweaponry.registries;

import net.mindoth.fabledweaponry.FabledWeaponry;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FabledWeaponryItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FabledWeaponry.MOD_ID);

    public static final RegistryObject<Item> GREATSWORD_WOOD = ITEMS.register("greatsword_wood",
            () -> new SwordItem(ItemTier.WOOD, 4, -3.0F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> MAUL_WOOD = ITEMS.register("maul_wood",
            () -> new SwordItem(ItemTier.WOOD, 4, -3.0F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> SCYTHE_WOOD = ITEMS.register("scythe_wood",
            () -> new SwordItem(ItemTier.WOOD, 2, -2.7F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> WARAXE_WOOD = ITEMS.register("waraxe_wood",
            () -> new AxeItem(ItemTier.WOOD, 5, -2.7F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    private static Item.Properties itemBuilder() {
        return new Item.Properties().tab(ItemGroup.TAB_COMBAT);
    }
}
