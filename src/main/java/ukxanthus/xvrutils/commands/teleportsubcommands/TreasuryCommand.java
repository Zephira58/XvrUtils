package ukxanthus.xvrutils.commands.teleportsubcommands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import ukxanthus.xvrutils.commands.SubCommand;

import java.util.logging.Logger;

public class TreasuryCommand extends SubCommand {
    Logger logger = Logger.getLogger("XvrUtils");

    public String getName() {
        return "treasury";
    }

    public String getDescription() {
        return "Teleports you to the treasury!";
    }

    public String getSyntax() {
        return "/warp treasury";
    }

    public void perform(Player player, String[] args) {
        if (args.length == 1) {
            Location location = player.getLocation();

            location.setX(-201);
            location.setY(75);
            location.setZ(-7647);

            player.teleport(location);
            player.sendMessage(ChatColor.YELLOW + "[XVR Utils]" + ChatColor.GREEN + " You have been teleported to the treasury!");
            logger.info("[XVR Utils]" + player.getName() + " has used the /warp treasury command! Teleporting to the treasury!");
        } else {
            player.sendMessage(ChatColor.YELLOW + "[XVR Utils] " + ChatColor.RED + "You must be a player to use this command!");
            logger.info("[XVR Utils] " + "A non-player has tried to use the /warp treasury command!");
        }
    }
}
