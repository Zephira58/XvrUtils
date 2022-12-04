package ukxanthus.xvrutils;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandRules implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        sender.sendMessage("Hello, " + sender.getName() + " and welcome to XVR! \n -Rules-\n1. No Griefing \n2. No Stealing \n3. No Hacking \n4. No Racism \n5. No Spamming \n6. No Advertising");
        return true;
    }
}
