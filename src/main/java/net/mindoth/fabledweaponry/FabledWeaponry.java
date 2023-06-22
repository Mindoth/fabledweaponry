package net.mindoth.fabledweaponry;

import net.mindoth.fabledweaponry.registries.FabledWeaponryItems;
import net.minecraftforge.api.distmarker.Dist;
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
    }
}
