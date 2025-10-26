package com.monserveur;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class listener implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();

        event.setJoinMessage(player.getName() + " §7a rejoint la partie §a(" + Bukkit.getOnlinePlayers().size() + "§a/" + Bukkit.getMaxPlayers() + ")");
    }
}
