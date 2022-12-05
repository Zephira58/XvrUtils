package ukxanthus.xvrutils.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import ukxanthus.xvrutils.commands.teleportsubcommands.*;

import java.util.ArrayList;

@SuppressWarnings("NullableProblems")
public class TeleportManager implements CommandExecutor {

    private final ArrayList<SubCommand> subcommands = new ArrayList<>();

    public TeleportManager() {
        subcommands.add(new RoofCommand());
        subcommands.add(new EndCommand());
        subcommands.add(new CasinoCommand());
        subcommands.add(new SpawnCommand());
        subcommands.add(new WarpRoomCommand());
        subcommands.add(new TreasuryCommand());
        subcommands.add(new JailCommand());
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player p = (Player) sender;

            if (args.length > 0) {
                for (int i = 0; i < getSubcommands().size(); i++) {
                    if (args[0].equalsIgnoreCase(getSubcommands().get(i).getName())) {
                        getSubcommands().get(i).perform(p, args);
                    }
                }
            } else {
                p.sendMessage(ChatColor.GREEN + "-Commands-\n");
                for (int i = 0; i < getSubcommands().size(); i++) {
                    p.sendMessage(getSubcommands().get(i).getSyntax() + " - " + getSubcommands().get(i).getDescription());
                }
                p.sendMessage(ChatColor.GREEN + "--------------------------------");
            }

        }


        return true;
    }

    public ArrayList<SubCommand> getSubcommands() {
        return subcommands;
    }

}
