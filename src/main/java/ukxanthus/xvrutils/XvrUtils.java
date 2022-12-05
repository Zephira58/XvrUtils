package ukxanthus.xvrutils;

import org.bukkit.plugin.java.JavaPlugin;
import ukxanthus.xvrutils.commands.TeleportManager;

import java.util.logging.Logger;

public final class XvrUtils extends JavaPlugin {
    Logger logger = Logger.getLogger(XvrUtils.class.getName());

    @Override
    public void onEnable() {
        // Plugin startup logic
        logger.info("XvrUtils has been enabled!");

        getServer().getPluginManager().registerEvents(new OnJoinRules(), this);

        this.getCommand("rules").setExecutor(new RulesCommand());
        this.getCommand("rtp").setExecutor(new RandomTeleportCommand());
        this.getCommand("warp").setExecutor(new TeleportManager());


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        logger.info("XvrUtils has unloaded!");
    }
}