package ukxanthus.xvrutils.commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Random;
import java.util.logging.Logger;

@SuppressWarnings("ALL")
public class RandomTeleportCommand implements CommandExecutor {
    Logger logger = Logger.getLogger("XvrUtils");

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Location location = player.getLocation();

            Random random = new Random();
            int x = random.nextInt(4000);
            int z = random.nextInt(4000) - 7304;

            location.setX(x);
            location.setY(85);
            location.setZ(z);

            player.teleport(location);
            player.sendMessage(ChatColor.YELLOW + "[XVR Utils]" + ChatColor.GREEN + " You have been teleported to " + x + ", " + z);
            logger.info("[XVR Utils]" + sender.getName() + " has used the /rtp command! Teleporting to " + x + ", " + z);
            return true;

        } else {
            sender.sendMessage(ChatColor.GREEN + "[XVR Utils] " + ChatColor.RED + "You must be a player to use this command!");
            logger.info("[XVR Utils] A non-player has tried to use the /rtp command!");
            return false;
        }
    }
}
