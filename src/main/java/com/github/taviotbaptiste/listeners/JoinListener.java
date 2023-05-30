package com.github.taviotbaptiste.listeners;

import com.github.taviotbaptiste.ItemCustom;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class JoinListener implements Listener {

    private final ItemCustom item;

    public JoinListener(ItemCustom item) {
        this.item = item;

    }

    //This methode add a flower to the inventory of the player at the first connection
    @EventHandler(priority = EventPriority.HIGH)
    public void onPlayerJoinItem(PlayerJoinEvent event) {
        //Initialization
        //get player
        Player player = event.getPlayer();


        //if no flower than set in the inventory
        if(!player.getInventory().contains(item.getItemStack()))
            player.getInventory().setItem(0, new ItemStack(item.getItemStack()));
    }
}
