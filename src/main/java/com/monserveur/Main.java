package com.monserveur;


import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;

    public class Main extends JavaPlugin {

        private static Main INSTANCE;

        @Override
        public void onLoad() { INSTANCE = this; }

        @Override
        public void onEnable() {
            getLogger().info("MonPlugin est activé !");

            new ListenersManager(this).registerListeners();
        }

        @Override
        public void onDisable() {
            getLogger().info("MonPlugin est désactivé !");
        }

        public static Main getINSTANCE() {
            return INSTANCE;
        }


    }
