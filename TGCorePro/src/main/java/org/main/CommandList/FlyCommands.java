package org.main.CommandList;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;

public class FlyCommands implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player o = (Player) sender;
            if (o.hasPermission("TGCore.fly")) {
                if (o.isFlying()) {
                    o.setAllowFlight(false);
                    o.setFlying(false);
                    o.sendMessage(ChatColor.YELLOW + "[TG Core Pro] " + ChatColor.BLUE + ChatColor.BOLD + ">" + ChatColor.RED + " Artık Uçmuyorsunuz!");
                    o.playSound(o.getLocation(), Sound.ENTITY_BAT_DEATH, 5 , 1);
                    return true;
                } else {
                    o.setAllowFlight(true);
                    o.setFlying(true);
                    o.sendMessage(ChatColor.YELLOW + "[TG Core Pro] " + ChatColor.BLUE + ChatColor.BOLD + ">" + ChatColor.GREEN + " Artık Uçuyorsun!");
                    o.playSound(o.getLocation(), Sound.ENTITY_BAT_LOOP, 5 , 1);
                 }
             }
         }
        return true;
    }
}

