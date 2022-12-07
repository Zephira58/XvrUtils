package ukxanthus.xvrutils.commands.teleportsubcommands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import ukxanthus.xvrutils.XvrUtils;
import ukxanthus.xvrutils.commands.SubCommand;

import java.util.logging.Logger;

public class RoofCommand extends SubCommand {
    Logger logger = Logger.getLogger(XvrUtils.class.getName());

    public String getName() {
        return "roof";
    }

    public String getDescription() {
        return "Teleports you to the roof of the mansion";
    }

    public String getSyntax() {
        return "/warp roof";
    }

    public void perform(Player player, String[] args) {
        if (args.length == 1) {
            Location location = player.getLocation();

            location.setX(188);
            location.setY(87);
            location.setZ(-7310);

            player.teleport(location);
            player.sendMessage(ChatColor.YELLOW + "[XVR Utils]" + ChatColor.GREEN + " You have been teleported to the roof of the roof!");
            logger.info("[XVR Utils] " + player.getName() + " has used the /warp roof command! Teleporting to the roof of the roof!");
        } else {
            player.sendMessage("[XVR Utils] " + "You must be a player to use this command!");
            logger.info("[XVR Utils] " + "A non-player has tried to use the /warp roof command!");
        }
    }
}
