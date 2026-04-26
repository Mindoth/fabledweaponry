package net.mindoth.fabledweaponry;

import net.mindoth.fabledweaponry.registries.FabledWeaponryItems;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.loading.FMLEnvironment;

@Mod(FabledWeaponry.MOD_ID)
public class FabledWeaponry {
    public static final String MOD_ID = "fabledweaponry";

    public FabledWeaponry(IEventBus modBus, ModContainer modContainer) {
        if ( FMLEnvironment.dist == Dist.CLIENT ) FabledWeaponryClient.registerHandlers(modBus, modContainer);
        addRegistries(modBus);
    }

    private void addRegistries(final IEventBus modBus) {
        FabledWeaponryItems.ITEMS.register(modBus);
    }
}
