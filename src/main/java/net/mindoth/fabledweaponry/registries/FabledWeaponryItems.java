package net.mindoth.fabledweaponry.registries;

import net.mindoth.fabledweaponry.FabledWeaponry;
import net.mindoth.fabledweaponry.item.*;
import net.mindoth.fabledweaponry.item.aegis.*;
import net.mindoth.fabledweaponry.item.ballista.*;
import net.mindoth.fabledweaponry.item.bulwark.*;
import net.mindoth.fabledweaponry.item.longbow.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FabledWeaponryItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FabledWeaponry.MOD_ID);

    public static final RegistryObject<Item> GREATSWORD_WOOD = ITEMS.register("greatsword_wood",
            () -> new GreatswordItem(Tiers.WOOD, 5, -2.8F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> GREATSWORD_STONE = ITEMS.register("greatsword_stone",
            () -> new GreatswordItem(Tiers.STONE, 5, -2.8F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> GREATSWORD_IRON = ITEMS.register("greatsword_iron",
            () -> new GreatswordItem(Tiers.IRON, 5, -2.8F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> GREATSWORD_GOLD = ITEMS.register("greatsword_gold",
            () -> new GreatswordItem(Tiers.GOLD, 5, -2.8F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> GREATSWORD_DIAMOND = ITEMS.register("greatsword_diamond",
            () -> new GreatswordItem(Tiers.DIAMOND, 5, -2.8F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> GREATSWORD_NETHERITE = ITEMS.register("greatsword_netherite",
            () -> new GreatswordItem(Tiers.NETHERITE, 5, -2.8F, new Item.Properties().stacksTo(1).fireResistant()));



    public static final RegistryObject<Item> WARAXE_WOOD = ITEMS.register("waraxe_wood",
            () -> new WaraxeItem(Tiers.WOOD, 5, -2.8F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> WARAXE_STONE = ITEMS.register("waraxe_stone",
            () -> new WaraxeItem(Tiers.STONE, 5, -2.8F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> WARAXE_IRON = ITEMS.register("waraxe_iron",
            () -> new WaraxeItem(Tiers.IRON, 5, -2.8F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> WARAXE_GOLD = ITEMS.register("waraxe_gold",
            () -> new WaraxeItem(Tiers.GOLD, 5, -2.8F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> WARAXE_DIAMOND = ITEMS.register("waraxe_diamond",
            () -> new WaraxeItem(Tiers.DIAMOND, 5, -2.8F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> WARAXE_NETHERITE = ITEMS.register("waraxe_netherite",
            () -> new WaraxeItem(Tiers.NETHERITE, 5, -2.8F, new Item.Properties().stacksTo(1).fireResistant()));



    public static final RegistryObject<Item> MAUL_WOOD = ITEMS.register("maul_wood",
            () -> new MaulItem(Tiers.WOOD, 6, -3.0F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> MAUL_STONE = ITEMS.register("maul_stone",
            () -> new MaulItem(Tiers.STONE, 6, -3.0F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> MAUL_IRON = ITEMS.register("maul_iron",
            () -> new MaulItem(Tiers.IRON, 6, -3.0F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> MAUL_GOLD = ITEMS.register("maul_gold",
            () -> new MaulItem(Tiers.GOLD, 6, -3.0F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> MAUL_DIAMOND = ITEMS.register("maul_diamond",
            () -> new MaulItem(Tiers.DIAMOND, 6, -3.0F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> MAUL_NETHERITE = ITEMS.register("maul_netherite",
            () -> new MaulItem(Tiers.NETHERITE, 6, -3.0F, new Item.Properties().stacksTo(1).fireResistant()));



    public static final RegistryObject<Item> SCYTHE_WOOD = ITEMS.register("scythe_wood",
            () -> new ScytheItem(Tiers.WOOD, 3, -3.0F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SCYTHE_STONE = ITEMS.register("scythe_stone",
            () -> new ScytheItem(Tiers.STONE, 5, -3.0F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SCYTHE_IRON = ITEMS.register("scythe_iron",
            () -> new ScytheItem(Tiers.IRON, 7, -3.0F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SCYTHE_GOLD = ITEMS.register("scythe_gold",
            () -> new ScytheItem(Tiers.GOLD, 3, -3.0F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SCYTHE_DIAMOND = ITEMS.register("scythe_diamond",
            () -> new ScytheItem(Tiers.DIAMOND, 9, -3.0F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SCYTHE_NETHERITE = ITEMS.register("scythe_netherite",
            () -> new ScytheItem(Tiers.NETHERITE, 11, -3.0F, new Item.Properties().stacksTo(1).fireResistant()));



    public static final RegistryObject<Item> DAGGER_WOOD = ITEMS.register("dagger_wood",
            () -> new DaggerItem(Tiers.WOOD, 0, -2.4F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> DAGGER_STONE = ITEMS.register("dagger_stone",
            () -> new DaggerItem(Tiers.STONE, 0, -2.4F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> DAGGER_IRON = ITEMS.register("dagger_iron",
            () -> new DaggerItem(Tiers.IRON, 0, -2.4F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> DAGGER_GOLD = ITEMS.register("dagger_gold",
            () -> new DaggerItem(Tiers.GOLD, 0, -2.4F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> DAGGER_DIAMOND = ITEMS.register("dagger_diamond",
            () -> new DaggerItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> DAGGER_NETHERITE = ITEMS.register("dagger_netherite",
            () -> new DaggerItem(Tiers.NETHERITE, 0, -2.4F, new Item.Properties().stacksTo(1).fireResistant()));



    public static final RegistryObject<Item> SCIMITAR_WOOD = ITEMS.register("scimitar_wood",
            () -> new ScimitarItem(Tiers.WOOD, 3, -2.4F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SCIMITAR_STONE = ITEMS.register("scimitar_stone",
            () -> new ScimitarItem(Tiers.STONE, 3, -2.4F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SCIMITAR_IRON = ITEMS.register("scimitar_iron",
            () -> new ScimitarItem(Tiers.IRON, 3, -2.4F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SCIMITAR_GOLD = ITEMS.register("scimitar_gold",
            () -> new ScimitarItem(Tiers.GOLD, 3, -2.4F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SCIMITAR_DIAMOND = ITEMS.register("scimitar_diamond",
            () -> new ScimitarItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SCIMITAR_NETHERITE = ITEMS.register("scimitar_netherite",
            () -> new ScimitarItem(Tiers.NETHERITE, 3, -2.4F, new Item.Properties().stacksTo(1).fireResistant()));



    public static final RegistryObject<Item> MACE_WOOD = ITEMS.register("mace_wood",
            () -> new MaceItem(Tiers.WOOD, 3, -2.6F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> MACE_STONE = ITEMS.register("mace_stone",
            () -> new MaceItem(Tiers.STONE, 3, -2.6F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> MACE_IRON = ITEMS.register("mace_iron",
            () -> new MaceItem(Tiers.IRON, 3, -2.6F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> MACE_GOLD = ITEMS.register("mace_gold",
            () -> new MaceItem(Tiers.GOLD, 3, -2.6F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> MACE_DIAMOND = ITEMS.register("mace_diamond",
            () -> new MaceItem(Tiers.DIAMOND, 3, -2.6F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> MACE_NETHERITE = ITEMS.register("mace_netherite",
            () -> new MaceItem(Tiers.NETHERITE, 3, -2.6F, new Item.Properties().stacksTo(1).fireResistant()));



    public static final RegistryObject<Item> LONGBOW = ITEMS.register("longbow",
            () -> new LongbowWood(new Item.Properties().durability(384)));

    public static final RegistryObject<Item> LONGBOW_LEATHER = ITEMS.register("longbow_leather",
            () -> new LongbowLeather(new Item.Properties().durability(768)));

    public static final RegistryObject<Item> LONGBOW_IRON = ITEMS.register("longbow_iron",
            () -> new LongbowIron(new Item.Properties().durability(1536)));

    public static final RegistryObject<Item> LONGBOW_GOLD = ITEMS.register("longbow_gold",
            () -> new LongbowGold(new Item.Properties().durability(384)));

    public static final RegistryObject<Item> LONGBOW_DIAMOND = ITEMS.register("longbow_diamond",
            () -> new LongbowDiamond(new Item.Properties().durability(3072)));

    public static final RegistryObject<Item> LONGBOW_NETHERITE = ITEMS.register("longbow_netherite",
            () -> new LongbowNetherite(new Item.Properties().durability(6144).fireResistant()));



    public static final RegistryObject<Item> BALLISTA = ITEMS.register("ballista",
            () -> new BallistaWood(new Item.Properties().durability(465)));

    public static final RegistryObject<Item> BALLISTA_LEATHER = ITEMS.register("ballista_leather",
            () -> new BallistaLeather(new Item.Properties().durability(930)));

    public static final RegistryObject<Item> BALLISTA_IRON = ITEMS.register("ballista_iron",
            () -> new BallistaIron(new Item.Properties().durability(1860)));

    public static final RegistryObject<Item> BALLISTA_GOLD = ITEMS.register("ballista_gold",
            () -> new BallistaGold(new Item.Properties().durability(465)));

    public static final RegistryObject<Item> BALLISTA_DIAMOND = ITEMS.register("ballista_diamond",
            () -> new BallistaDiamond(new Item.Properties().durability(3720)));

    public static final RegistryObject<Item> BALLISTA_NETHERITE = ITEMS.register("ballista_netherite",
            () -> new BallistaNetherite(new Item.Properties().durability(7440).fireResistant()));



    public static final RegistryObject<Item> AEGIS_WOOD = ITEMS.register("aegis_wood",
            () -> new AegisWood(new Item.Properties().durability(336)));

    public static final RegistryObject<Item> AEGIS_LEATHER = ITEMS.register("aegis_leather",
            () -> new AegisLeather(new Item.Properties().durability(672)));

    public static final RegistryObject<Item> AEGIS_IRON = ITEMS.register("aegis_iron",
            () -> new AegisIron(new Item.Properties().durability(1344)));

    public static final RegistryObject<Item> AEGIS_GOLD = ITEMS.register("aegis_gold",
            () -> new AegisGold(new Item.Properties().durability(336)));

    public static final RegistryObject<Item> AEGIS_DIAMOND = ITEMS.register("aegis_diamond",
            () -> new AegisDiamond(new Item.Properties().durability(2688)));

    public static final RegistryObject<Item> AEGIS_NETHERITE = ITEMS.register("aegis_netherite",
            () -> new AegisNetherite(new Item.Properties().durability(5376).fireResistant()));



    public static final RegistryObject<Item> BULWARK_WOOD = ITEMS.register("bulwark_wood",
            () -> new BulwarkWood(new Item.Properties().durability(336)));

    public static final RegistryObject<Item> BULWARK_LEATHER = ITEMS.register("bulwark_leather",
            () -> new BulwarkLeather(new Item.Properties().durability(672)));

    public static final RegistryObject<Item> BULWARK_IRON = ITEMS.register("bulwark_iron",
            () -> new BulwarkIron(new Item.Properties().durability(1344)));

    public static final RegistryObject<Item> BULWARK_GOLD = ITEMS.register("bulwark_gold",
            () -> new BulwarkGold(new Item.Properties().durability(336)));

    public static final RegistryObject<Item> BULWARK_DIAMOND = ITEMS.register("bulwark_diamond",
            () -> new BulwarkDiamond(new Item.Properties().durability(2688)));

    public static final RegistryObject<Item> BULWARK_NETHERITE = ITEMS.register("bulwark_netherite",
            () -> new BulwarkNetherite(new Item.Properties().durability(5376).fireResistant()));



    public static final RegistryObject<Item> TOME_LEATHER = ITEMS.register("tome_leather",
            () -> new TomeItem(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> TOME_IRON = ITEMS.register("tome_iron",
            () -> new TomeItem(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> TOME_GOLD = ITEMS.register("tome_gold",
            () -> new TomeItem(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> TOME_DIAMOND = ITEMS.register("tome_diamond",
            () -> new TomeItem(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> TOME_NETHERITE = ITEMS.register("tome_netherite",
            () -> new TomeItem(new Item.Properties().stacksTo(1).fireResistant()));



    private static Item.Properties itemBuilder() {
        return new Item.Properties();
    }
}
