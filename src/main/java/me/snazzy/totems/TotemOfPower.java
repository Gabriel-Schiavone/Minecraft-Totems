package me.snazzy.totems;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;

public class TotemOfPower implements Listener {
    @EventHandler
    public void onAttack(EntityDamageByEntityEvent attack) {

        if (attack.getDamager() instanceof Player) {
            Player attacker = ((Player) attack.getDamager()).getPlayer();
            ItemStack offHand = attacker.getInventory().getItemInOffHand();

            if (offHand.toString().contains("author=Mr_Snazzy")) {

                if (offHand.toString().contains("title=Totem of Power")) {

                    attack.setDamage(1000);

                }
            }
        }
    }
}
