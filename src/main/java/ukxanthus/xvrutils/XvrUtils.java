package ukxanthus.xvrutils;

import org.bukkit.plugin.java.JavaPlugin;
import java.util.logging.*;

public final class XvrUtils extends JavaPlugin {
    Logger logger = Logger.getLogger(XvrUtils.class.getName());
    @Override
    public void onEnable() {
        // Plugin startup logic

        logger.info("XvrUtils has been enabled!");
        this.getCommand("rules").setExecutor(new CommandRules());
        this.getCommand("spawn").setExecutor(new CommandSpawn());
        this.getCommand("rtp").setExecutor(new CommandRandomTeleport());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        logger.info("XvrUtils has unloaded!");
    }
}