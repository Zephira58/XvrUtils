package ukxanthus.xvrutils;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import java.util.Random;
import java.util.logging.*;

public class CommandRandomTeleport implements CommandExecutor {
    Logger logger = Logger.getLogger(XvrUtils.class.getName());
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        //Detect if the sender is a player
        if (sender instanceof Player) {
            Player player = (Player) sender;
            //Get the player's current location
            Location location = player.getLocation();
            //Get the world the player is in
            World world = player.getWorld();
            //Generate a random number between 0 and 1000
            Random random = new Random();
            int x = random.nextInt(4000);
            int z = random.nextInt(4000);
            //Set the player's location to the random location
            location.setX(x);
            location.setY(85);
            location.setZ(z);
            player.teleport(location);
            //Send the player a message
            player.sendMessage(ChatColor.GREEN + "[XVR Utils]" + " You have been teleported to " + x + ", " + z);
            logger.info("[XVR Utils] " + sender.getName() + " has used the /rtp command! Teleporting to " + x + ", " + z);
            return true;
        } else {
            //If the sender is not a player, send a message
            sender.sendMessage(ChatColor.GREEN + "[XVR Utils]" + ChatColor.RED + "You must be a player to use this command!");
            logger.info("[XVR Utils] A non-player has tried to use the /rtp command!");
            return false;
        }
    }
}
