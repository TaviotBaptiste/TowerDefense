package com.github.taviotbaptiste.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class TestCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player player){
            ItemStack item = new ItemStack(Material.CORNFLOWER);
            ItemMeta itemMeta = item.getItemMeta();
            if (itemMeta != null){
                itemMeta.setDisplayName(ChatColor.RED+ "" + ChatColor.BOLD + "Home");
                item.setItemMeta(itemMeta);
                player.getInventory().addItem(new ItemStack(item));
            }
        }
        return false;
    }
}
