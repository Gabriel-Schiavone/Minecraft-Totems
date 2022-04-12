package me.snazzy.totems;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;

public class TotemOfFlight implements Listener {

    @EventHandler
    public void onOffHandChange(PlayerMoveEvent event) {
        Player player = (Player) event.getPlayer();
        ItemStack offHand = event.getPlayer().getInventory().getItemInOffHand();

        if (offHand.toString().contains("title=Totem of Flight")) {

            if (offHand.toString().contains("author=Mr_Snazzy")) {

                player.setAllowFlight(true);
            }
        } else if (player.getGameMode().equals(GameMode.CREATIVE)) {

            player.setAllowFlight(true);

        } else if (player.getGameMode().equals(GameMode.SPECTATOR)) {

            player.setAllowFlight(true);

        } else {

            player.setAllowFlight(false);
        }
    }
}
