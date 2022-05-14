package org.main.Listener;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class QuitManager implements Listener {

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        Player o = e.getPlayer();

        e.setQuitMessage(ChatColor.DARK_GRAY + "[" + ChatColor.RED + ChatColor.BOLD + "-" + ChatColor.DARK_GRAY + "] " + ChatColor.YELLOW + o.getName());

        if (!o.isOp()) {
            if (o.hasPermission("TGCore.vip")) {
                e.setQuitMessage(ChatColor.YELLOW + o.getName() + ChatColor.AQUA + " Adlı VIP Oyundan Ayrıldı!");
            }
        }

        if (!o.isOp()) {
            if (o.hasPermission("TGCore.vipp")) {
                e.setQuitMessage(ChatColor.GOLD + o.getName() + ChatColor.AQUA + " Adlı VIP+ Oyundan Ayrıldı!");
            }
        }

        if (!o.isOp()) {
            if (o.hasPermission("TGCore.mvip")) {
                e.setQuitMessage(ChatColor.DARK_BLUE + o.getName() + ChatColor.AQUA + " Adlı MVIP Oyundan Ayrıldı!");
            }
        }

        if (!o.isOp()) {
            if (o.hasPermission("TGCore.mvipp")) {
                e.setQuitMessage(ChatColor.DARK_PURPLE + o.getName() + ChatColor.AQUA + " Adlı MVIP+ Oyundan Ayrıldı!");
            }
        }

        if (!o.isOp()) {
            if (o.hasPermission("TGCore.tvip")) {
                e.setQuitMessage(ChatColor.AQUA + o.getName() + ChatColor.AQUA + " Adlı TVIP Oyundan Ayrıldı!");
            }
        }

        if (!o.isOp()) {
            if (o.hasPermission("TGCore.tvipp")) {
                e.setQuitMessage(ChatColor.RED + o.getName() + ChatColor.AQUA + " Adlı TVIP+ Oyundan Ayrıldı!");
            }
        }
    }
}
