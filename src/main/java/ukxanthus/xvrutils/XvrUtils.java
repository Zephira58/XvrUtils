package ukxanthus.xvrutils;

import org.bukkit.plugin.java.JavaPlugin;
import java.util.logging.*;
import ukxanthus.xvrutils.commands.TeleportManager;

public final class XvrUtils extends JavaPlugin {
    Logger logger = Logger.getLogger(XvrUtils.class.getName());

    @Override
    public void onEnable() {
        // Plugin startup logic
        logger.info("XvrUtils has been enabled!");

        getServer().getPluginManager().registerEvents(new OnJoinRules(), this);

        this.getCommand("rules").setExecutor(new RulesCommand());
        this.getCommand("spawn").setExecutor(new SpawnCommand());
        this.getCommand("rtp").setExecutor(new RandomTeleportCommand());

        this.getCommand("warp").setExecutor(new TeleportManager());


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        logger.info("XvrUtils has unloaded!");
    }
}