package com.github.taviotbaptiste;

import org.bukkit.plugin.java.JavaPlugin;

public final class TowerDefense extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("[Tower Defense] - Running");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("[Tower Defense] - Stop");
    }
}
