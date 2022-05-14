package org.main;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.main.CommandList.*;
import org.main.Listener.ChatManager;
import org.main.Listener.JoinManager;
import org.main.Listener.QuitManager;

public final class Main extends JavaPlugin {

    public static Main instance;

    public static Main getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {

        getLogger().info(ChatColor.GREEN + ">====================<");
        getLogger().info("");
        getLogger().info(ChatColor.GREEN + "TGCORE PRO Eklentisi Aktif");
        getLogger().info("");
        getLogger().info(ChatColor.GREEN + "Eklenti Sürümü: 1.16.5");
        getLogger().info("");
        getLogger().info(ChatColor.GREEN + "TGCORE PRO");
        getLogger().info("");
        getLogger().info(ChatColor.GREEN + ">====================<");

        this.getServer().getPluginManager().registerEvents(new ChatManager(), this);
        this.getServer().getPluginManager().registerEvents(new JoinManager(), this);
        this.getServer().getPluginManager().registerEvents(new QuitManager(), this);

        getCommand("c").setExecutor(new CreativeCommands());
        getCommand("s").setExecutor(new SurvivalCommands());
        getCommand("fly").setExecutor(new FlyCommands());
        getCommand("lobiayarla").setExecutor(new LobbyCommands());
        getCommand("lobi").setExecutor(new LobbyCommands());
        getCommand("etkinlikhata").setExecutor(new ActivityMessageCommands());
        getCommand("tgcore").setExecutor(new TGCoreCommands());

        instance = this;

    }
    @Override
    public void onDisable() {

        getLogger().info(ChatColor.RED + "TG CORE PRO De Aktif");

    }

    public void loadConfig() {
        getConfig().options().copyDefaults(true);
        saveConfig();
    }
}
