package org.main.CommandList;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TGCoreCommands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player o = (Player) sender;
            o.sendMessage(ChatColor.YELLOW + "");
            o.sendMessage(ChatColor.YELLOW + "TG CORE PRO Eklentisi");
            o.sendMessage(ChatColor.YELLOW + "");
            o.sendMessage(ChatColor.YELLOW + "Eklenti Sürümü: 1.16.5");
            o.sendMessage(ChatColor.YELLOW + "");
            o.sendMessage(ChatColor.YELLOW + "Eklenti Versionu: 1.0.3");
            o.sendMessage(ChatColor.YELLOW + "");
            o.sendMessage(ChatColor.YELLOW + "Eklenti Yapımcısı: wwTunahan");
            o.sendMessage(ChatColor.YELLOW + "");
            o.sendMessage(ChatColor.YELLOW + "Eklenti Yazılım Dili: Java Script");
            o.sendMessage(ChatColor.YELLOW + "");
            o.sendMessage(ChatColor.YELLOW + "Son Güncelleme: 04.05.2022");
            o.sendMessage(ChatColor.YELLOW + "");
            o.playSound(o.getLocation(), Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 5, 1);
        }
        return true;
    }
}
