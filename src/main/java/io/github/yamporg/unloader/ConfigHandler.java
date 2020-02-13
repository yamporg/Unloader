package io.github.yamporg.unloader;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = UnloaderMod.MODID)
public class ConfigHandler {
    @SubscribeEvent
    public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (!event.getModID().equals(UnloaderMod.MODID)) {
            return;
        }
        ConfigManager.sync(UnloaderMod.MODID, Config.Type.INSTANCE);
    }
}
