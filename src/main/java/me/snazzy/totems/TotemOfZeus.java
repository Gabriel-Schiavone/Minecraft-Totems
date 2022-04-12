package me.snazzy.totems;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class TotemOfZeus implements Listener {

    @EventHandler
    public void onRightClick(PlayerInteractEvent event) {
        ItemStack offHand = event.getPlayer().getInventory().getItemInOffHand();
        Block targetBlock = event.getPlayer().getTargetBlockExact(20);
        if (targetBlock == null)
            return;
        Location targetLoc = targetBlock.getLocation();

        if (offHand.toString().contains("author=Mr_Snazzy")) {

            if (offHand.toString().contains("title=Totem of Zeus")) {

                event.setCancelled(true);

                event.getPlayer().getWorld().strikeLightning(targetLoc);
            }
        }
    }
}
