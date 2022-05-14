package org.main.CommandList;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ActivityMessageCommands implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
        Player o = (Player) sender;
         o.sendMessage(ChatColor.YELLOW + "[TG Core Pro] " + ChatColor.BLUE + ChatColor.BOLD + ">" + ChatColor.RED + " Malesef Şu Anda Bir Etkinlik Bulunamadı!");
          o.playSound(o.getLocation(), Sound.ENTITY_VILLAGER_NO, 5, 1);
        }
        return true;
    }
}
