package org.main.Listener;

import java.util.HashMap;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.main.Main;

public class ChatManager implements Listener {

    Main plugin = Main.getPlugin(Main.class);
    private HashMap<String, Long> cl = new HashMap<String, Long>();
    @EventHandler()
    public void onChat(AsyncPlayerChatEvent events) {
        Player o = events.getPlayer();
        if (o.hasPermission("TGCore.spam")) return;
        for (String s: events.getMessage().split(" ")) {
            if (plugin.getConfig().getStringList("KüfürEngelList").contains(s)) {
                events.setCancelled(true);
                events.getPlayer().sendMessage(ChatColor.YELLOW + "[TG Core Pro] " + ChatColor.BLUE + ChatColor.BOLD + ">" + ChatColor.RED + " Lütfen Bu Kelimeleri Kullanmayın!");
                o.playSound(o.getLocation(), Sound.BLOCK_ANVIL_LAND, 10, 1);
            }
        }

        Long time = System.currentTimeMillis();
        try {
            Long lastUse = this.cl.get(o.getName());
            if (lastUse + 5*1000 > time) {
                o.sendMessage(ChatColor.YELLOW + "[TG Core Pro] " + ChatColor.BLUE + ChatColor.BOLD + ">" + ChatColor.RED + " Lütfen Yavaş Mesaj Atın!");
                o.playSound(o.getLocation(), Sound.BLOCK_NOTE_BLOCK_SNARE,5, 1);
                events.setCancelled(true);
            }
        } catch (Exception ex) {
        }
        try {
            cl.remove(o.getName());
        } catch (Exception ex) {
        }
        cl.put(o.getName(), time);
    }
}
