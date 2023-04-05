package net.mindoth.fabledweaponry;

import net.mindoth.fabledweaponry.registries.FabledWeaponryItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(FabledWeaponry.MOD_ID)
public class FabledWeaponry {
    public static final String MOD_ID = "fabledweaponry";

    public FabledWeaponry() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        addRegistries(modEventBus);
    }

    private void addRegistries(final IEventBus modEventBus) {
        FabledWeaponryItems.ITEMS.register(modEventBus);
    }
}
