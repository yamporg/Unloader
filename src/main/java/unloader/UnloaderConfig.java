package unloader;

import net.minecraftforge.common.config.Config;

@Config(modid = UnloaderMod.MODID)
public class UnloaderConfig {
    @Config.Name("blacklistDims")
    @Config.Comment({
        "List of dimensions you don’t want to unload.",
        "Can be dimension name or ID. Uses regular expressions.",
    })
    public static String[] blacklistDims = {"0", "overworld"};

    @Config.Name("unloadCheck")
    @Config.Comment({
        "Time (in ticks) to wait before checking dimensions",
    })
    public static Integer unloadInterval = 600;
}
