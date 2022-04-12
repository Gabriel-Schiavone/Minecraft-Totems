package me.snazzy.totems;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class TotemOfBoom implements Listener {

    @EventHandler
    public void onRightClick(PlayerInteractEvent event) {
        ItemStack offHand = event.getPlayer().getInventory().getItemInOffHand();
        Block targetBlock = event.getPlayer().getTargetBlockExact(5);
        if (targetBlock == null)
            return;
        Location targetLoc = targetBlock.getLocation();

        if (offHand.toString().contains("author=Mr_Snazzy")) {

            if (offHand.toString().contains("title=Totem of Boom")) {

                event.setCancelled(true);

                event.getPlayer().getWorld().spawnEntity(targetLoc.add(0, 1, 0), EntityType.PRIMED_TNT);
            }
        }
    }
}
