package me.snazzy.totems;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.inventory.ItemStack;

public class TotemOfLife implements Listener {

    @EventHandler
    public void onAttack(EntityDamageEvent damage) {

        if (damage.getEntity() instanceof Player) {
            Player target = ((Player) damage.getEntity()).getPlayer();
            ItemStack offHand = target.getInventory().getItemInOffHand();

            if (offHand.toString().contains("author=Mr_Snazzy")) {

                if (offHand.toString().contains("title=Totem of Life")) {

                    damage.setDamage(0);

                }
            }
        }
    }
}