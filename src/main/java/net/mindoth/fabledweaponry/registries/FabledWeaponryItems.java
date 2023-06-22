package net.mindoth.fabledweaponry.registries;

import net.mindoth.fabledweaponry.FabledWeaponry;
import net.mindoth.fabledweaponry.item.*;
import net.mindoth.fabledweaponry.item.ballista.*;
import net.mindoth.fabledweaponry.item.longbow.*;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FabledWeaponryItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FabledWeaponry.MOD_ID);

    public static final RegistryObject<Item> GREATSWORD_WOOD = ITEMS.register("greatsword_wood",
            () -> new GreatswordItem(ItemTier.WOOD, 5, -2.8F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> GREATSWORD_STONE = ITEMS.register("greatsword_stone",
            () -> new GreatswordItem(ItemTier.STONE, 5, -2.8F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> GREATSWORD_IRON = ITEMS.register("greatsword_iron",
            () -> new GreatswordItem(ItemTier.IRON, 5, -2.8F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> GREATSWORD_GOLD = ITEMS.register("greatsword_gold",
            () -> new GreatswordItem(ItemTier.GOLD, 5, -2.8F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> GREATSWORD_DIAMOND = ITEMS.register("greatsword_diamond",
            () -> new GreatswordItem(ItemTier.DIAMOND, 5, -2.8F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> GREATSWORD_NETHERITE = ITEMS.register("greatsword_netherite",
            () -> new GreatswordItem(ItemTier.NETHERITE, 5, -2.8F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));



    public static final RegistryObject<Item> WARAXE_WOOD = ITEMS.register("waraxe_wood",
            () -> new WaraxeItem(ItemTier.WOOD, 5, -2.8F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> WARAXE_STONE = ITEMS.register("waraxe_stone",
            () -> new WaraxeItem(ItemTier.STONE, 5, -2.8F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> WARAXE_IRON = ITEMS.register("waraxe_iron",
            () -> new WaraxeItem(ItemTier.IRON, 5, -2.8F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> WARAXE_GOLD = ITEMS.register("waraxe_gold",
            () -> new WaraxeItem(ItemTier.GOLD, 5, -2.8F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> WARAXE_DIAMOND = ITEMS.register("waraxe_diamond",
            () -> new WaraxeItem(ItemTier.DIAMOND, 5, -2.8F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> WARAXE_NETHERITE = ITEMS.register("waraxe_netherite",
            () -> new WaraxeItem(ItemTier.NETHERITE, 5, -2.8F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));



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
            () -> new ScytheItem(ItemTier.WOOD, 3, -3.0F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> SCYTHE_STONE = ITEMS.register("scythe_stone",
            () -> new ScytheItem(ItemTier.STONE, 5, -3.0F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> SCYTHE_IRON = ITEMS.register("scythe_iron",
            () -> new ScytheItem(ItemTier.IRON, 7, -3.0F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> SCYTHE_GOLD = ITEMS.register("scythe_gold",
            () -> new ScytheItem(ItemTier.GOLD, 3, -3.0F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> SCYTHE_DIAMOND = ITEMS.register("scythe_diamond",
            () -> new ScytheItem(ItemTier.DIAMOND, 9, -3.0F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> SCYTHE_NETHERITE = ITEMS.register("scythe_netherite",
            () -> new ScytheItem(ItemTier.NETHERITE, 11, -3.0F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));



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



    public static final RegistryObject<Item> MACE_WOOD = ITEMS.register("mace_wood",
            () -> new MaceItem(ItemTier.WOOD, 3, -2.2F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> MACE_STONE = ITEMS.register("mace_stone",
            () -> new MaceItem(ItemTier.STONE, 3, -2.2F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> MACE_IRON = ITEMS.register("mace_iron",
            () -> new MaceItem(ItemTier.IRON, 3, -2.2F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> MACE_GOLD = ITEMS.register("mace_gold",
            () -> new MaceItem(ItemTier.GOLD, 3, -2.2F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> MACE_DIAMOND = ITEMS.register("mace_diamond",
            () -> new MaceItem(ItemTier.DIAMOND, 3, -2.2F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> MACE_NETHERITE = ITEMS.register("mace_netherite",
            () -> new MaceItem(ItemTier.NETHERITE, 3, -2.2F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));



    public static final RegistryObject<Item> LONGBOW = ITEMS.register("longbow",
            () -> new LongbowWood(new Item.Properties().tab(ItemGroup.TAB_COMBAT).durability(384)));

    public static final RegistryObject<Item> LONGBOW_LEATHER = ITEMS.register("longbow_leather",
            () -> new LongbowLeather(new Item.Properties().tab(ItemGroup.TAB_COMBAT).durability(768)));

    public static final RegistryObject<Item> LONGBOW_IRON = ITEMS.register("longbow_iron",
            () -> new LongbowIron(new Item.Properties().tab(ItemGroup.TAB_COMBAT).durability(1536)));

    public static final RegistryObject<Item> LONGBOW_GOLD = ITEMS.register("longbow_gold",
            () -> new LongbowGold(new Item.Properties().tab(ItemGroup.TAB_COMBAT).durability(384)));

    public static final RegistryObject<Item> LONGBOW_DIAMOND = ITEMS.register("longbow_diamond",
            () -> new LongbowDiamond(new Item.Properties().tab(ItemGroup.TAB_COMBAT).durability(3072)));

    public static final RegistryObject<Item> LONGBOW_NETHERITE = ITEMS.register("longbow_netherite",
            () -> new LongbowNetherite(new Item.Properties().tab(ItemGroup.TAB_COMBAT).durability(6144)));



    public static final RegistryObject<Item> BALLISTA = ITEMS.register("ballista",
            () -> new BallistaWood(new Item.Properties().tab(ItemGroup.TAB_COMBAT).durability(465)));

    public static final RegistryObject<Item> BALLISTA_LEATHER = ITEMS.register("ballista_leather",
            () -> new BallistaLeather(new Item.Properties().tab(ItemGroup.TAB_COMBAT).durability(930)));

    public static final RegistryObject<Item> BALLISTA_IRON = ITEMS.register("ballista_iron",
            () -> new BallistaIron(new Item.Properties().tab(ItemGroup.TAB_COMBAT).durability(1860)));

    public static final RegistryObject<Item> BALLISTA_GOLD = ITEMS.register("ballista_gold",
            () -> new BallistaGold(new Item.Properties().tab(ItemGroup.TAB_COMBAT).durability(465)));

    public static final RegistryObject<Item> BALLISTA_DIAMOND = ITEMS.register("ballista_diamond",
            () -> new BallistaDiamond(new Item.Properties().tab(ItemGroup.TAB_COMBAT).durability(3720)));

    public static final RegistryObject<Item> BALLISTA_NETHERITE = ITEMS.register("ballista_netherite",
            () -> new BallistaNetherite(new Item.Properties().tab(ItemGroup.TAB_COMBAT).durability(7440)));



    public static final RegistryObject<Item> AEGIS_WOOD = ITEMS.register("aegis_wood",
            () -> new AegisItem(new Item.Properties().tab(ItemGroup.TAB_COMBAT).durability(336)));

    public static final RegistryObject<Item> AEGIS_LEATHER = ITEMS.register("aegis_leather",
            () -> new AegisItem(new Item.Properties().tab(ItemGroup.TAB_COMBAT).durability(672)));

    public static final RegistryObject<Item> AEGIS_IRON = ITEMS.register("aegis_iron",
            () -> new AegisItem(new Item.Properties().tab(ItemGroup.TAB_COMBAT).durability(1344)));

    public static final RegistryObject<Item> AEGIS_GOLD = ITEMS.register("aegis_gold",
            () -> new AegisItem(new Item.Properties().tab(ItemGroup.TAB_COMBAT).durability(336)));

    public static final RegistryObject<Item> AEGIS_DIAMOND = ITEMS.register("aegis_diamond",
            () -> new AegisItem(new Item.Properties().tab(ItemGroup.TAB_COMBAT).durability(2688)));

    public static final RegistryObject<Item> AEGIS_NETHERITE = ITEMS.register("aegis_netherite",
            () -> new AegisItem(new Item.Properties().tab(ItemGroup.TAB_COMBAT).durability(5376)));



    public static final RegistryObject<Item> BULWARK_WOOD = ITEMS.register("bulwark_wood",
            () -> new BulwarkItem(new Item.Properties().tab(ItemGroup.TAB_COMBAT).durability(336)));

    public static final RegistryObject<Item> BULWARK_LEATHER = ITEMS.register("bulwark_leather",
            () -> new BulwarkItem(new Item.Properties().tab(ItemGroup.TAB_COMBAT).durability(672)));

    public static final RegistryObject<Item> BULWARK_IRON = ITEMS.register("bulwark_iron",
            () -> new BulwarkItem(new Item.Properties().tab(ItemGroup.TAB_COMBAT).durability(1344)));

    public static final RegistryObject<Item> BULWARK_GOLD = ITEMS.register("bulwark_gold",
            () -> new BulwarkItem(new Item.Properties().tab(ItemGroup.TAB_COMBAT).durability(336)));

    public static final RegistryObject<Item> BULWARK_DIAMOND = ITEMS.register("bulwark_diamond",
            () -> new BulwarkItem(new Item.Properties().tab(ItemGroup.TAB_COMBAT).durability(2688)));

    public static final RegistryObject<Item> BULWARK_NETHERITE = ITEMS.register("bulwark_netherite",
            () -> new BulwarkItem(new Item.Properties().tab(ItemGroup.TAB_COMBAT).durability(5376)));



    private static Item.Properties itemBuilder() {
        return new Item.Properties().tab(ItemGroup.TAB_COMBAT);
    }
}
