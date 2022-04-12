package me.snazzy.totems;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;

public class TotemOfBans implements Listener {

    @EventHandler
    public void onAttack(EntityDamageByEntityEvent attack) {

        if (attack.getDamager() instanceof Player) {

            if (attack.getEntity() instanceof Player) {

                Player attacker = ((Player) attack.getDamager()).getPlayer();
                ItemStack inventory = attacker.getInventory().getItemInOffHand();
                String targetName = attack.getEntity().getName();

                if (inventory.toString().contains("author=Mr_Snazzy")) {

                    if (inventory.toString().contains("title=Totem of Bans")) {

                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "ban " + targetName);
                    }
                }
            }
        }
    }
}
