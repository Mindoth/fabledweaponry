package net.mindoth.fabledweaponry;

import net.mindoth.fabledweaponry.registries.FabledWeaponryItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;

@Mod(FabledWeaponry.MOD_ID)
public class FabledWeaponry {
    public static final String MOD_ID = "fabledweaponry";

    public FabledWeaponry() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        if ( FMLEnvironment.dist == Dist.CLIENT ) {
            FabledWeaponryClient.registerHandlers();
        }
        addRegistries(modEventBus);
    }

    private void addRegistries(final IEventBus modEventBus) {
        FabledWeaponryItems.ITEMS.register(modEventBus);
        modEventBus.addListener(this::addCreative);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if ( event.getTabKey() == CreativeModeTabs.COMBAT ) {
            event.accept(FabledWeaponryItems.GREATSWORD_WOOD);
            event.accept(FabledWeaponryItems.GREATSWORD_STONE);
            event.accept(FabledWeaponryItems.GREATSWORD_IRON);
            event.accept(FabledWeaponryItems.GREATSWORD_GOLD);
            event.accept(FabledWeaponryItems.GREATSWORD_DIAMOND);
            event.accept(FabledWeaponryItems.GREATSWORD_NETHERITE);

            event.accept(FabledWeaponryItems.WARAXE_WOOD);
            event.accept(FabledWeaponryItems.WARAXE_STONE);
            event.accept(FabledWeaponryItems.WARAXE_IRON);
            event.accept(FabledWeaponryItems.WARAXE_GOLD);
            event.accept(FabledWeaponryItems.WARAXE_DIAMOND);
            event.accept(FabledWeaponryItems.WARAXE_NETHERITE);

            event.accept(FabledWeaponryItems.MAUL_WOOD);
            event.accept(FabledWeaponryItems.MAUL_STONE);
            event.accept(FabledWeaponryItems.MAUL_IRON);
            event.accept(FabledWeaponryItems.MAUL_GOLD);
            event.accept(FabledWeaponryItems.MAUL_DIAMOND);
            event.accept(FabledWeaponryItems.MAUL_NETHERITE);

            event.accept(FabledWeaponryItems.SCYTHE_WOOD);
            event.accept(FabledWeaponryItems.SCYTHE_STONE);
            event.accept(FabledWeaponryItems.SCYTHE_IRON);
            event.accept(FabledWeaponryItems.SCYTHE_GOLD);
            event.accept(FabledWeaponryItems.SCYTHE_DIAMOND);
            event.accept(FabledWeaponryItems.SCYTHE_NETHERITE);

            event.accept(FabledWeaponryItems.DAGGER_WOOD);
            event.accept(FabledWeaponryItems.DAGGER_STONE);
            event.accept(FabledWeaponryItems.DAGGER_IRON);
            event.accept(FabledWeaponryItems.DAGGER_GOLD);
            event.accept(FabledWeaponryItems.DAGGER_DIAMOND);
            event.accept(FabledWeaponryItems.DAGGER_NETHERITE);

            event.accept(FabledWeaponryItems.SCIMITAR_WOOD);
            event.accept(FabledWeaponryItems.SCIMITAR_STONE);
            event.accept(FabledWeaponryItems.SCIMITAR_IRON);
            event.accept(FabledWeaponryItems.SCIMITAR_GOLD);
            event.accept(FabledWeaponryItems.SCIMITAR_DIAMOND);
            event.accept(FabledWeaponryItems.SCIMITAR_NETHERITE);

            event.accept(FabledWeaponryItems.MACE_WOOD);
            event.accept(FabledWeaponryItems.MACE_STONE);
            event.accept(FabledWeaponryItems.MACE_IRON);
            event.accept(FabledWeaponryItems.MACE_GOLD);
            event.accept(FabledWeaponryItems.MACE_DIAMOND);
            event.accept(FabledWeaponryItems.MACE_NETHERITE);

            event.accept(FabledWeaponryItems.LONGBOW);
            event.accept(FabledWeaponryItems.LONGBOW_LEATHER);
            event.accept(FabledWeaponryItems.LONGBOW_IRON);
            event.accept(FabledWeaponryItems.LONGBOW_GOLD);
            event.accept(FabledWeaponryItems.LONGBOW_DIAMOND);
            event.accept(FabledWeaponryItems.LONGBOW_NETHERITE);

            event.accept(FabledWeaponryItems.BALLISTA);
            event.accept(FabledWeaponryItems.BALLISTA_LEATHER);
            event.accept(FabledWeaponryItems.BALLISTA_IRON);
            event.accept(FabledWeaponryItems.BALLISTA_GOLD);
            event.accept(FabledWeaponryItems.BALLISTA_DIAMOND);
            event.accept(FabledWeaponryItems.BALLISTA_NETHERITE);

            event.accept(FabledWeaponryItems.AEGIS_WOOD);
            event.accept(FabledWeaponryItems.AEGIS_LEATHER);
            event.accept(FabledWeaponryItems.AEGIS_IRON);
            event.accept(FabledWeaponryItems.AEGIS_GOLD);
            event.accept(FabledWeaponryItems.AEGIS_DIAMOND);
            event.accept(FabledWeaponryItems.AEGIS_NETHERITE);

            event.accept(FabledWeaponryItems.BULWARK_WOOD);
            event.accept(FabledWeaponryItems.BULWARK_LEATHER);
            event.accept(FabledWeaponryItems.BULWARK_IRON);
            event.accept(FabledWeaponryItems.BULWARK_GOLD);
            event.accept(FabledWeaponryItems.BULWARK_DIAMOND);
            event.accept(FabledWeaponryItems.BULWARK_NETHERITE);

            event.accept(FabledWeaponryItems.TOME_LEATHER);
            event.accept(FabledWeaponryItems.TOME_IRON);
            event.accept(FabledWeaponryItems.TOME_GOLD);
            event.accept(FabledWeaponryItems.TOME_DIAMOND);
            event.accept(FabledWeaponryItems.TOME_NETHERITE);
        }
    }
}
