package net.mindoth.fabledweaponry;

import net.mindoth.fabledweaponry.util.ModItemProperties;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

public class FabledWeaponryClient {

    public static void registerHandlers(IEventBus modBus, ModContainer modContainer) {
        modBus.addListener(FabledWeaponryClient::clientSetup);
    }

    private static void clientSetup(final FMLClientSetupEvent event) {
        ModItemProperties.addCustomItemProperties();
    }
}
