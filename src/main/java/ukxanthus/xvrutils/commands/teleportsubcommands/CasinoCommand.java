package ukxanthus.xvrutils.commands.teleportsubcommands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import ukxanthus.xvrutils.commands.SubCommand;

import java.util.logging.Logger;


public class CasinoCommand extends SubCommand {
    Logger logger = Logger.getLogger("XvrUtils");

    public String getName() {
        return "casino";
    }

    public String getDescription() {
        return "Teleports you to the casino!";
    }

    public String getSyntax() {
        return "/warp casino";
    }

    public void perform(Player player, String[] args) {
        if (args.length == 1) {
            Location location = player.getLocation();

            location.setX(661);
            location.setY(65);
            location.setZ(-7204);

            player.teleport(location);
            player.sendMessage(ChatColor.YELLOW + "[XVR Utils]" + ChatColor.GREEN + " You have been teleported to the roof of the mansion!");
            logger.info("[XVR Utils]" + player.getName() + " has used the /warp casino command! Teleporting to the casino!");
        } else {
            player.sendMessage(ChatColor.GREEN + "[XVR Utils] " + ChatColor.RED + "You must be a player to use this command!");
            logger.info("[XVR Utils] " + "A non-player has tried to use the /warp casino command!");
        }
    }
}
