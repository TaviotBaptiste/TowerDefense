package com.github.taviotbaptiste;

import com.github.taviotbaptiste.commands.TestCommand;
import com.github.taviotbaptiste.listeners.JoinListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class TowerDefense extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("[Tower Defense] - Running");
        //Listener (Item)
        getServer().getPluginManager().registerEvents(new JoinListener(), this);
        //test commande
        getCommand("tw").setExecutor(new TestCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("[Tower Defense] - Stop");
    }
}
