package ukxanthus.xvrutils;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import java.util.Properties;

import java.util.logging.Logger;
public class RulesCommand implements CommandExecutor {
    Logger logger = Logger.getLogger(XvrUtils.class.getName());

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Properties props = new Properties();
        sender.sendMessage("Hello, " + ChatColor.GREEN + sender.getName() + ChatColor.WHITE + " and welcome to " + ChatColor.GREEN + "XVR! \n" + ChatColor.RED + "-Rules-\n1. No Griefing \n2. No Stealing \n3. No Hacking \n4. No Racism \n5. No Spamming \n6. No Advertising");
        logger.info(ChatColor.GREEN + "[XVR Utils]" + " Rules have been sent to " + sender.getName());
        return true;
    }
}
