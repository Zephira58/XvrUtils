package ukxanthus.xvrutils.commands.teleportsubcommands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import ukxanthus.xvrutils.commands.SubCommand;

import java.util.logging.Logger;

public class JailCommand extends SubCommand {
    Logger logger = Logger.getLogger("XvrUtils");

    public String getName() {
        return "jail";
    }

    public String getDescription() {
        return "Teleports you to the jail!";
    }

    public String getSyntax() {
        return "/warp jail";
    }

    public void perform(Player player, String[] args) {
        if (args.length == 1) {
            Location location = player.getLocation();

            location.setX(201);
            location.setY(68);
            location.setZ(-7322);

            player.teleport(location);
            player.sendMessage(ChatColor.YELLOW + "[XVR Utils]" + ChatColor.GREEN + " You have been teleported to the roof of the mansion!");
            logger.info("[XVR Utils]" + player.getName() + " has used the /warp jail command! Teleporting to the jail!");
        } else {
            player.sendMessage(ChatColor.GREEN + "[XVR Utils] " + ChatColor.RED + "You must be a player to use this command!");
            logger.info("[XVR Utils] " + "A non-player has tried to use the /warp jail command!");
        }
    }
}
