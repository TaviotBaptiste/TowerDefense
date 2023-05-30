package com.github.taviotbaptiste.listeners;

import com.github.taviotbaptiste.ItemCustom;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.inventory.ItemStack;

public class DropItemListener implements Listener {


    private final ItemCustom item;


    public DropItemListener(ItemCustom item) {
        this.item = item;
    }


    @EventHandler
    public void onPlayerDropItem(PlayerDropItemEvent event){
        //Initialization
        //item event
        ItemStack itemDrop = event.getItemDrop().getItemStack();
        
        if (itemDrop.equals(item.getItemStack())){
            event.setCancelled(true);
        }
    }
}
