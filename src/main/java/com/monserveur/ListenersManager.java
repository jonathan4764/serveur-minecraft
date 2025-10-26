package com.monserveur;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

public class ListenersManager {

    public Plugin plugin;
    public PluginManager pm;

    public ListenersManager(Plugin plugin) {
        this.plugin = plugin;
        this.pm = Bukkit.getPluginManager();
    }

    public void registerListeners() {
        pm.registerEvents(new listener(), this.plugin);



    }
}
