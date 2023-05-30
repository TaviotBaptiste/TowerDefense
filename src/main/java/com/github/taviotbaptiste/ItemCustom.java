package com.github.taviotbaptiste;

import org.bukkit.inventory.ItemStack;

public class ItemCustom {

    //Inisialization
    private ItemStack itemStack;


    //Constructor
    public ItemCustom(ItemStack itemStack) {
        this.itemStack = itemStack;
    }


    //Getter - Setter
    public ItemStack getItemStack() {
        return itemStack;
    }

    public void setItemStack(ItemStack itemStack) {
        this.itemStack = itemStack;
    }

}
