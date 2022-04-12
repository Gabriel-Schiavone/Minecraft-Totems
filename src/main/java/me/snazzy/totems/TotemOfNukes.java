package me.snazzy.totems;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class TotemOfNukes implements Listener {

    @EventHandler
    public void onClick(PlayerInteractEvent event) {
        ItemStack offHand = event.getPlayer().getInventory().getItemInOffHand();
        Player player = event.getPlayer();
        Location loc = player.getLocation();

        if (offHand.toString().contains("author=Mr_Snazzy")) {

            if (offHand.toString().contains("title=Totem of Nukes")) {

                event.setCancelled(true);

                player.getWorld().createExplosion(loc, 40);
            }
        }
    }
}
