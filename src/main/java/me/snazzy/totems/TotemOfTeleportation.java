package me.snazzy.totems;

import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class TotemOfTeleportation implements Listener {

    @EventHandler
    public void onRightClick(PlayerInteractEvent event) {
        ItemStack offHand = event.getPlayer().getInventory().getItemInOffHand();
        Block targetBlock = event.getPlayer().getTargetBlockExact(30);
        if (targetBlock == null)
            return;
        Location targetLoc = targetBlock.getLocation();
        Player player = event.getPlayer();
        float yaw = player.getLocation().getYaw();
        float pitch = player.getLocation().getPitch();
        targetLoc.setYaw(yaw);
        targetLoc.setPitch(pitch);

        if (offHand.toString().contains("author=Mr_Snazzy")) {

            if (offHand.toString().contains("title=Totem of Teleportation")) {

                event.setCancelled(true);

                player.teleport(targetLoc.add(0.5, 1, 0.5));

                player.playSound(targetLoc, Sound.ENTITY_ENDERMAN_TELEPORT, 1, 1);
                player.playSound(player.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1, 1);
            }
        }
    }
}
