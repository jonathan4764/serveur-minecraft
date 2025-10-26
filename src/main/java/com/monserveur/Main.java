package com.monserveur;


import org.bukkit.plugin.java.JavaPlugin;

    public class Main extends JavaPlugin {

        @Override
        public void onEnable() {
            getLogger().info("MonPlugin est activé !");

            new ListenersManager(this).registerListeners();
        }

        @Override
        public void onDisable() {
            getLogger().info("MonPlugin est désactivé !");
        }


    }
