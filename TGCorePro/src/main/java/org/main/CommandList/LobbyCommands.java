package org.main.CommandList;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LobbyCommands implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player o = (Player) sender;

            if(label.equalsIgnoreCase("lobi")) {
                o.sendMessage(ChatColor.YELLOW + "[TG Core Pro] " + ChatColor.BLUE + ChatColor.BOLD + ">" + ChatColor.AQUA + " Lobiye Işınlandınız!");
                 o.playSound(o.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 5, 1);
                o.teleport(o.getWorld().getSpawnLocation());
            }

            if(label.equalsIgnoreCase("lobiayarla")) {
                if(!sender.hasPermission("TGCore.sp")) {
                    sender.sendMessage(ChatColor.YELLOW + "[TG Core Pro] " + ChatColor.BLUE + ChatColor.BOLD + ">" + ChatColor.RED + " Bu İşlem İçin Yetkiniz Bulunmamakta!");
                     o.playSound(o.getLocation(), Sound.ENTITY_WANDERING_TRADER_NO, 5, 1);
                    return true;
                }
                World world = o.getWorld();
                Location loc = o.getLocation();
                o.sendMessage(ChatColor.YELLOW + "[TG Core Pro] " + ChatColor.BLUE + ChatColor.BOLD + ">" + ChatColor.AQUA + " Lobiyi Başarıyla Ayarladınız!");
                 o.playSound(o.getLocation(), Sound.ENTITY_WANDERING_TRADER_YES, 5, 1);
                world.setSpawnLocation(loc.getBlockX(), loc.getBlockY() + 1, loc.getBlockZ());
            }
        }
        return true;
    }
}

