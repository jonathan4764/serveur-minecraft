package com.monserveur;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class listener implements Listener {


    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        // Delay pour s'assurer que le joueur est dans le monde
        new BukkitRunnable() {
            @Override
            public void run() {
                // Téléportation
                player.teleport(new Location(Bukkit.getWorld("botwproject"), 3904, 153, 5621));

                // Message aux autres joueurs
                String message = "§7" + player.getName() + " a rejoint la partie §a(" + Bukkit.getOnlinePlayers().size() + "/" + Bukkit.getMaxPlayers() + ")";
                for (Player p : Bukkit.getOnlinePlayers()) {
                    if (!p.equals(player)) {
                        p.sendMessage(message);
                    }
                }
            }
        }.runTaskLater(Main.getINSTANCE(), 10L); // 10 ticks = 0,5 secondes
    }
}
