package ukxanthus.xvrutils;

import org.bukkit.plugin.java.JavaPlugin;
import ukxanthus.xvrutils.commands.RandomTeleportCommand;
import ukxanthus.xvrutils.commands.RulesCommand;
import ukxanthus.xvrutils.commands.TeleportManager;

import java.util.Objects;
import java.util.logging.Logger;

public final class XvrUtils extends JavaPlugin {
    Logger logger = Logger.getLogger(XvrUtils.class.getName());

    @Override
    public void onEnable() {
        // Plugin startup logic
        logger.info("XvrUtils has been enabled!");

        getServer().getPluginManager().registerEvents(new OnJoinRules(), this);

        Objects.requireNonNull(this.getCommand("rules")).setExecutor(new RulesCommand());
        Objects.requireNonNull(this.getCommand("rtp")).setExecutor(new RandomTeleportCommand());
        Objects.requireNonNull(this.getCommand("warp")).setExecutor(new TeleportManager());


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        logger.info("XvrUtils has unloaded!");
    }
}