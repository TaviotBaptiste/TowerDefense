package com.github.taviotbaptiste;

import com.github.taviotbaptiste.commands.TestCommand;
import com.github.taviotbaptiste.listeners.DropItemListener;
import com.github.taviotbaptiste.listeners.JoinListener;
import org.bukkit.ChatColor;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public final class TowerDefense extends JavaPlugin {
    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("[Tower Defense] - Running");



        //item = Poppy flower
        ItemCustom item = null;
        item = new ItemCustom(new ItemStack(Flower.POPPY.getFlower()));

        //itemMeta = New Name (Change the name of the object)
        ItemMeta itemMeta = item.getItemStack().getItemMeta();
        if (itemMeta != null) {
            itemMeta.setDisplayName(ChatColor.RED+ "" + ChatColor.BOLD + "Home");
        }
        //item = new name (itemMeta)
        item.getItemStack().setItemMeta(itemMeta);



        //Listener (Item)
        getServer().getPluginManager().registerEvents(new JoinListener(item), this);
        //Listener (DropItemListener)
        getServer().getPluginManager().registerEvents(new DropItemListener(item), this);
        //test commande
        getCommand("tw").setExecutor(new TestCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("[Tower Defense] - Stop");
    }
}
