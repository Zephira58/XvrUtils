package ukxanthus.xvrutils.commands.teleportsubcommands;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import ukxanthus.xvrutils.commands.SubCommand;

//import java.util.Properties;
import java.util.logging.Logger;

public class SpawnCommand extends SubCommand {
    //Properties props = new Properties();
    Logger logger = Logger.getLogger("XvrUtils");

    public String getName() {
        return "spawn";
    }

    public String getDescription() {
        return "Teleports you to the spawn!";
    }

    public String getSyntax() {
        return "/warp spawn";
    }

    public void perform(Player player, String[] args) {
        if (player != null) {
            player.teleport(player.getWorld().getSpawnLocation());
            player.sendMessage(ChatColor.YELLOW + "[XVR Utils]" + ChatColor.GREEN + " You have been teleported to spawn!");
            logger.info("[XVR Utils] " + player.getName() + "has used the /warp spawn command! Teleporting to spawn...");
        } else {
            player.sendMessage("You must be a player to use this command!");
            logger.info("[XVR Utils]" + " A non-player has tried to use the /warp spawn command!");
        }
    }
}
