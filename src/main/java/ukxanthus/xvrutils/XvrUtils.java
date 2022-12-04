package ukxanthus.xvrutils;

import org.bukkit.plugin.java.JavaPlugin;

public final class XvrUtils extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("XvrUtils has been enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("XvrUtils has been disabled!");
    }
}
