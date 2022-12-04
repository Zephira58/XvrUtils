package ukxanthus.xvrutils;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.bukkit.command.CommandSender;

import java.util.logging.Logger;

public class CommandSpawn implements CommandExecutor {
    Logger logger = Logger.getLogger(XvrUtils.class.getName());
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.teleport(player.getWorld().getSpawnLocation());
                player.sendMessage(ChatColor.GREEN + "You have been teleported to spawn!");
                logger.info(sender.getName() + " has used the /spawn command! Teleporting to spawn...");
                return true;
            } else {
                sender.sendMessage("You must be a player to use this command!");
                logger.info("A non-player has tried to use the /spawn command!");
                return true;
            }
    }
}
