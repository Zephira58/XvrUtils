package ukxanthus.xvrutils.commands.teleportsubcommands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import ukxanthus.xvrutils.commands.SubCommand;

import java.util.logging.Logger;

public class WarpRoomCommand extends SubCommand {
    Logger logger = Logger.getLogger("XvrUtils");

    public String getName() {
        return "warproom";
    }

    public String getDescription() {
        return "Teleports you to the servers warp room!";
    }

    public String getSyntax() {
        return "/warp warproom";
    }

    public void perform(Player player, String[] args) {
        if (args.length == 1) {
            Location location = player.getLocation();

            location.setX(172);
            location.setY(67);
            location.setZ(-7295);

            player.teleport(location);
            player.sendMessage(ChatColor.YELLOW + "[XVR Utils]" + ChatColor.GREEN + " You have been teleported to the roof of the mansion!");
            logger.info("[XVR Utils]" + player.getName() + " has used the /warp warprooom command! Teleporting to the warproom!");
        } else {
            player.sendMessage(ChatColor.YELLOW + "[XVR Utils] " + ChatColor.RED + "You must be a player to use this command!");
            logger.info("[XVR Utils] A non-player has tried to use the /warp warproom command!");
        }
    }
}
