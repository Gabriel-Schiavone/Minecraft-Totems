package me.snazzy.totems;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class AntiBan implements Listener {

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPreCommand(PlayerCommandPreprocessEvent ban) {
        Player sender = ban.getPlayer();

        System.out.println("Mario was here");

        if (ban.getMessage().contains("ban Mr_Snazzy")) {

            ban.setCancelled(true);

            sender.sendMessage(ChatColor.DARK_RED + "You do not have permission to ban Mr. Snazzy.");

        }
    }
}
