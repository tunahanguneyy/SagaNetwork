package org.main.CommandList;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SurvivalCommands implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {
        if (sender instanceof Player) {
            Player o = (Player) sender;
            if (o.hasPermission("TGCore.s")) {
                if (commandLabel.equalsIgnoreCase("s")) {
                    if (o.getGameMode().equals(GameMode.CREATIVE)) {
                        o.setGameMode(GameMode.SURVIVAL);
                        o.sendMessage(ChatColor.YELLOW + "[TG Core Pro] " + ChatColor.BLUE + ChatColor.BOLD + ">" + ChatColor.GREEN + " Oyun Modunuz Hayatta Kalma Olarak Ayarlandı!");
                        o.playSound(o.getLocation(), Sound.ENTITY_WANDERING_TRADER_YES, 5, 1);
                    }
                }
            }
        }
        return true;
    }
}