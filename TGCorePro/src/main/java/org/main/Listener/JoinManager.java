package org.main.Listener;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinManager implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player o = e.getPlayer();

        e.setJoinMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + ChatColor.BOLD + "+" + ChatColor.DARK_GRAY + "] " + ChatColor.YELLOW + o.getName());

        if (!o.isOp()) {
            if (o.hasPermission("TGCore.vip")) {
                e.setJoinMessage(ChatColor.YELLOW + o.getName() + ChatColor.AQUA + " Adlı VIP Oyuna Katıldı!");
                o.sendMessage(ChatColor.YELLOW + "[TG Core Pro] " + ChatColor.BLUE + ChatColor.BOLD + ">" + ChatColor.GREEN + " Seni Tekrardan Görmek Ne Güzel!");
                o.sendTitle(ChatColor.GREEN + "VIP Seviyeniz", ChatColor.YELLOW + "VIP");
                o.playSound(o.getLocation(), Sound.ENTITY_FIREWORK_ROCKET_LAUNCH, 5, 1);
            }
        }

        if (!o.isOp()) {
            if (o.hasPermission("TGCore.vipp")) {
                e.setJoinMessage(ChatColor.GOLD + o.getName() + ChatColor.AQUA + " Adlı VIP+ Oyuna Katıldı!");
                o.sendMessage(ChatColor.YELLOW + "[TG Core Pro] " + ChatColor.BLUE + ChatColor.BOLD + ">" + ChatColor.GREEN + " Seni Tekrardan Görmek Ne Güzel!");
                o.sendTitle(ChatColor.GREEN + "VIP Seviyeniz", ChatColor.GOLD + "VIP+");
                o.playSound(o.getLocation(), Sound.ENTITY_FIREWORK_ROCKET_LAUNCH, 5, 1);
            }
        }

        if (!o.isOp()) {
            if (o.hasPermission("TGCore.mvip")) {
                e.setJoinMessage(ChatColor.DARK_BLUE + o.getName() + ChatColor.AQUA + " Adlı MVIP Oyuna Katıldı!");
                o.sendMessage(ChatColor.YELLOW + "[TG Core Pro] " + ChatColor.BLUE + ChatColor.BOLD + ">" + ChatColor.GREEN + " Seni Tekrardan Görmek Ne Güzel!");
                o.sendTitle(ChatColor.GREEN + "VIP Seviyeniz", ChatColor.DARK_BLUE + "MVIP");
                o.playSound(o.getLocation(), Sound.ENTITY_FIREWORK_ROCKET_LAUNCH, 5, 1);
            }
        }

        if (!o.isOp()) {
            if (o.hasPermission("TGCore.mvipp")) {
                e.setJoinMessage(ChatColor.DARK_PURPLE + o.getName() + ChatColor.AQUA + " Adlı MVIP+ Oyuna Katıldı!");
                o.sendMessage(ChatColor.YELLOW + "[TG Core Pro] " + ChatColor.BLUE + ChatColor.BOLD + ">" + ChatColor.GREEN + " Seni Tekrardan Görmek Ne Güzel!");
                o.sendTitle(ChatColor.GREEN + "VIP Seviyeniz", ChatColor.DARK_PURPLE + "MVIP+");
                o.playSound(o.getLocation(), Sound.ENTITY_FIREWORK_ROCKET_LAUNCH, 5, 1);
            }
        }

        if (!o.isOp()) {
            if (o.hasPermission("TGCore.tvip")) {
                e.setJoinMessage(ChatColor.AQUA + o.getName() + ChatColor.AQUA + " Adlı TVIP Oyuna Katıldı!");
                o.sendMessage(ChatColor.YELLOW + "[TG Core Pro] " + ChatColor.BLUE + ChatColor.BOLD + ">" + ChatColor.GREEN + " Seni Tekrardan Görmek Ne Güzel!");
                o.sendTitle(ChatColor.GREEN + "VIP Seviyeniz", ChatColor.AQUA + "TVIP");
                o.playSound(o.getLocation(), Sound.ENTITY_FIREWORK_ROCKET_LAUNCH, 5, 1);
            }
        }

        if (!o.isOp()) {
            if (o.hasPermission("TGCore.tvipp")) {
                e.setJoinMessage(ChatColor.RED + o.getName() + ChatColor.AQUA + " Adlı TVIP+ Oyuna Katıldı!");
                o.sendMessage(ChatColor.YELLOW + "[TG Core Pro] " + ChatColor.BLUE + ChatColor.BOLD + ">" + ChatColor.GREEN + " Seni Tekrardan Görmek Ne Güzel!");
                o.sendTitle(ChatColor.GREEN + "VIP Seviyeniz", ChatColor.RED + "TVIP+");
                o.playSound(o.getLocation(), Sound.ENTITY_FIREWORK_ROCKET_LAUNCH, 5, 1);
            }
        }
    }
}
