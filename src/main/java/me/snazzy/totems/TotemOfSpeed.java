package me.snazzy.totems;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;

public class TotemOfSpeed implements Listener {

    @EventHandler
    public void onOffHandChange(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        ItemStack offHand = event.getPlayer().getInventory().getItemInOffHand();

        if (offHand.toString().contains("title=Totem of Speed")) {

            if (offHand.toString().contains("author=Mr_Snazzy")) {

                player.setWalkSpeed(1);
            }
        } else {

            player.setWalkSpeed((float) 0.2);
        }
    }
}
