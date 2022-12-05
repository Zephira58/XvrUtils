package ukxanthus.xvrutils;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.bukkit.command.CommandSender;

import java.util.Properties;
import java.util.logging.Logger;

public class SpawnCommand implements CommandExecutor {
    Properties props = new Properties();
    Logger logger = Logger.getLogger(XvrUtils.class.getName());
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.teleport(player.getWorld().getSpawnLocation());
                player.sendMessage(ChatColor.GREEN + "[XVR Utils]" + " You have been teleported to spawn!");
                logger.info(props.get("PREFIX") + sender.getName() + "has used the /spawn command! Teleporting to spawn...");
                return true;
            } else {
                sender.sendMessage("You must be a player to use this command!");
                logger.info(props.get("PREFIX") + " A non-player has tried to use the /spawn command!");
                return true;
            }
    }
}
