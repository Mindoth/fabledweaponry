package net.mindoth.fabledweaponry.registries;

import net.mindoth.fabledweaponry.FabledWeaponry;
import net.mindoth.fabledweaponry.item.DaggerItem;
import net.mindoth.fabledweaponry.item.MaulItem;
import net.mindoth.fabledweaponry.item.ScimitarItem;
import net.mindoth.fabledweaponry.item.ScytheItem;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FabledWeaponryItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FabledWeaponry.MOD_ID);

    public static final RegistryObject<Item> GREATSWORD_WOOD = ITEMS.register("greatsword_wood",
            () -> new SwordItem(ItemTier.WOOD, 5, -2.8F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> GREATSWORD_STONE = ITEMS.register("greatsword_stone",
            () -> new SwordItem(ItemTier.STONE, 5, -2.8F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> GREATSWORD_IRON = ITEMS.register("greatsword_iron",
            () -> new SwordItem(ItemTier.IRON, 5, -2.8F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> GREATSWORD_GOLD = ITEMS.register("greatsword_gold",
            () -> new SwordItem(ItemTier.GOLD, 5, -2.8F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> GREATSWORD_DIAMOND = ITEMS.register("greatsword_diamond",
            () -> new SwordItem(ItemTier.DIAMOND, 5, -2.8F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> GREATSWORD_NETHERITE = ITEMS.register("greatsword_netherite",
            () -> new SwordItem(ItemTier.NETHERITE, 5, -2.8F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));



    public static final RegistryObject<Item> WARAXE_WOOD = ITEMS.register("waraxe_wood",
            () -> new AxeItem(ItemTier.WOOD, 5, -2.8F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> WARAXE_STONE = ITEMS.register("waraxe_stone",
            () -> new AxeItem(ItemTier.STONE, 5, -2.8F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> WARAXE_IRON = ITEMS.register("waraxe_iron",
            () -> new AxeItem(ItemTier.IRON, 5, -2.8F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> WARAXE_GOLD = ITEMS.register("waraxe_gold",
            () -> new AxeItem(ItemTier.GOLD, 5, -2.8F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> WARAXE_DIAMOND = ITEMS.register("waraxe_diamond",
            () -> new AxeItem(ItemTier.DIAMOND, 5, -2.8F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> WARAXE_NETHERITE = ITEMS.register("waraxe_netherite",
            () -> new AxeItem(ItemTier.NETHERITE, 5, -2.8F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));



    public static final RegistryObject<Item> MAUL_WOOD = ITEMS.register("maul_wood",
            () -> new MaulItem(ItemTier.WOOD, 6, -3.0F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> MAUL_STONE = ITEMS.register("maul_stone",
            () -> new MaulItem(ItemTier.STONE, 6, -3.0F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> MAUL_IRON = ITEMS.register("maul_iron",
            () -> new MaulItem(ItemTier.IRON, 6, -3.0F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> MAUL_GOLD = ITEMS.register("maul_gold",
            () -> new MaulItem(ItemTier.GOLD, 6, -3.0F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> MAUL_DIAMOND = ITEMS.register("maul_diamond",
            () -> new MaulItem(ItemTier.DIAMOND, 6, -3.0F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> MAUL_NETHERITE = ITEMS.register("maul_netherite",
            () -> new MaulItem(ItemTier.NETHERITE, 6, -3.0F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));



    public static final RegistryObject<Item> SCYTHE_WOOD = ITEMS.register("scythe_wood",
            () -> new ScytheItem(ItemTier.WOOD, 5, -2.8F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> SCYTHE_STONE = ITEMS.register("scythe_stone",
            () -> new ScytheItem(ItemTier.STONE, 5, -2.8F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> SCYTHE_IRON = ITEMS.register("scythe_iron",
            () -> new ScytheItem(ItemTier.IRON, 5, -2.8F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> SCYTHE_GOLD = ITEMS.register("scythe_gold",
            () -> new ScytheItem(ItemTier.GOLD, 5, -2.8F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> SCYTHE_DIAMOND = ITEMS.register("scythe_diamond",
            () -> new ScytheItem(ItemTier.DIAMOND, 5, -2.8F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> SCYTHE_NETHERITE = ITEMS.register("scythe_netherite",
            () -> new ScytheItem(ItemTier.NETHERITE, 5, -2.8F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));



    public static final RegistryObject<Item> DAGGER_WOOD = ITEMS.register("dagger_wood",
            () -> new DaggerItem(ItemTier.WOOD, 0, -2.4F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> DAGGER_STONE = ITEMS.register("dagger_stone",
            () -> new DaggerItem(ItemTier.STONE, 0, -2.4F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> DAGGER_IRON = ITEMS.register("dagger_iron",
            () -> new DaggerItem(ItemTier.IRON, 0, -2.4F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> DAGGER_GOLD = ITEMS.register("dagger_gold",
            () -> new DaggerItem(ItemTier.GOLD, 0, -2.4F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> DAGGER_DIAMOND = ITEMS.register("dagger_diamond",
            () -> new DaggerItem(ItemTier.DIAMOND, 0, -2.4F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> DAGGER_NETHERITE = ITEMS.register("dagger_netherite",
            () -> new DaggerItem(ItemTier.NETHERITE, 0, -2.4F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));



    public static final RegistryObject<Item> SCIMITAR_WOOD = ITEMS.register("scimitar_wood",
            () -> new ScimitarItem(ItemTier.WOOD, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> SCIMITAR_STONE = ITEMS.register("scimitar_stone",
            () -> new ScimitarItem(ItemTier.STONE, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> SCIMITAR_IRON = ITEMS.register("scimitar_iron",
            () -> new ScimitarItem(ItemTier.IRON, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> SCIMITAR_GOLD = ITEMS.register("scimitar_gold",
            () -> new ScimitarItem(ItemTier.GOLD, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> SCIMITAR_DIAMOND = ITEMS.register("scimitar_diamond",
            () -> new ScimitarItem(ItemTier.DIAMOND, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> SCIMITAR_NETHERITE = ITEMS.register("scimitar_netherite",
            () -> new ScimitarItem(ItemTier.NETHERITE, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    private static Item.Properties itemBuilder() {
        return new Item.Properties().tab(ItemGroup.TAB_COMBAT);
    }
}
