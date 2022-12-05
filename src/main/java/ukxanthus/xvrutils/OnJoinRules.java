package ukxanthus.xvrutils;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class OnJoinRules implements Listener {
    @EventHandler
    void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.sendMessage("Hello, " + ChatColor.GREEN + event.getPlayer().getDisplayName() + ChatColor.WHITE + " and welcome to " + ChatColor.GREEN + "XVR! \n" + ChatColor.RED + "-Rules-\n1. No Griefing \n2. No Stealing \n3. No Hacking \n4. No Racism \n5. No Spamming \n6. No Advertising");
    }
}
