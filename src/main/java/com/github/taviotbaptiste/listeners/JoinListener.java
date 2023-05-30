package com.github.taviotbaptiste.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class JoinListener implements Listener {

    //item = Poppy flower
    ItemStack item = new ItemStack(Material.POPPY);
    //itemMeta = getItemMeta
    ItemMeta itemMeta = item.getItemMeta();

    //
    @EventHandler(priority = EventPriority.HIGH)
    public void onPlayerJoinItem(PlayerJoinEvent event) {
        //Initialization
        //get player
        Player player = event.getPlayer();

        //Set data
        //itemMeta = New Name (Change the name of the object)
        itemMeta.setDisplayName(ChatColor.RED+ "" + ChatColor.BOLD + "Home");
        //item = new name (itemMeta)
        item.setItemMeta(itemMeta);

        //if no flower than set in the inventory
        if(!player.getInventory().contains(item))
            player.getInventory().setItem(0, new ItemStack(item));

    }
    @EventHandler
    public void onPlayerDropItem(PlayerDropItemEvent event){
        //Initialization
        //item event
        ItemStack itemDrop = event.getItemDrop().getItemStack();


        //Set data
        //itemMeta = New Name (Change the name of the object)
        itemMeta.setDisplayName(ChatColor.RED+ "" + ChatColor.BOLD + "Home");
        //item = new name (itemMeta)
        item.setItemMeta(itemMeta);

        if (itemDrop.equals(item)){
            event.setCancelled(true);

        }
    }
}
