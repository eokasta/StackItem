package com.github.eokasta.stackitem;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class StackItemCommand implements CommandExecutor {

    private final StackItemPlugin plugin;

    public StackItemCommand(StackItemPlugin plugin) {
        this.plugin = plugin;

        plugin.getCommand("stackitem").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (args.length > 0 && args[0].equalsIgnoreCase("reload")) {
            plugin.getSettings().getFile().reload();
            sender.sendMessage(format("&aStackItem reload completed."));
            return true;
        }

        sender.sendMessage(format(" &eStackItem &7- &bLucas Monteiro (EoKasta) \n" +
                " &7Version: &f" + plugin.getDescription().getVersion() + "\n" +
                " &7Description: &f" + plugin.getDescription().getDescription() + "\n" +
                " &7Repository: &f" + plugin.getDescription().getWebsite()));

        return true;
    }

    private String format(String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }
}
