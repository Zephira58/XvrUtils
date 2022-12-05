package ukxanthus.xvrutils.commands.teleportsubcommands;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import ukxanthus.xvrutils.XvrUtils;
import ukxanthus.xvrutils.commands.SubCommand;

import java.util.Properties;
import java.util.logging.Logger;

public class SpawnCommand extends SubCommand {
    Properties props = new Properties();
    Logger logger = Logger.getLogger(XvrUtils.class.getName());

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
        if (player instanceof Player) {
            player.teleport(player.getWorld().getSpawnLocation());
            player.sendMessage(ChatColor.GREEN + "[XVR Utils]" + " You have been teleported to spawn!");
            logger.info(props.get("PREFIX") + player.getName() + "has used the /spawn command! Teleporting to spawn...");
        } else {
            player.sendMessage("You must be a player to use this command!");
            logger.info(props.get("PREFIX") + " A non-player has tried to use the /spawn command!");
        }
    }
}
