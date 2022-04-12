package me.snazzy.totems;

import me.snazzy.commands.Commands;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Totems has loaded");

        getServer().getPluginManager().registerEvents(new AntiBan(), this);
        getServer().getPluginManager().registerEvents(new TotemOfBans(), this);
        getServer().getPluginManager().registerEvents(new TotemOfLife(), this);
        getServer().getPluginManager().registerEvents(new TotemOfBoom(), this);
        getServer().getPluginManager().registerEvents(new TotemOfPower(), this);
        getServer().getPluginManager().registerEvents(new TotemOfZeus(), this);
        getServer().getPluginManager().registerEvents(new TotemOfFlight(), this);
        getServer().getPluginManager().registerEvents(new TotemOfSpeed(), this);
        getServer().getPluginManager().registerEvents(new TotemOfVanish(), this);
        getServer().getPluginManager().registerEvents(new TotemOfTeleportation(), this);
        getServer().getPluginManager().registerEvents(new TotemOfNukes(), this);
        getServer().getPluginManager().registerEvents(new Commands(), this);

        getCommand("totems").setExecutor(new Commands());
        getCommand("totem").setExecutor(new Commands());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
