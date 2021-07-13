package me.devik.test_gui;

import net.md_5.bungee.api.chat.ClickEvent;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class GUIEvent implements Listener {

    ItemStack bread = new ItemStack(Material.BREAD, 64);
    ItemStack salmon = new ItemStack(Material.SALMON, 64);

    @EventHandler
    public void ClickEvent(InventoryClickEvent e){
        Player p = (Player) e.getWhoClicked();


        if(e.getView().getTitle().equalsIgnoreCase(ChatColor.GOLD + "Test GUI")){
            switch (e.getCurrentItem().getType()){
                case TNT:
                    p.closeInventory();
                    p.setHealth(0.0);
                    p.getInventory().getItem(11);
                    break;

                case BREAD:
                    p.closeInventory();
                    p.setHealth(20.0);
                    p.getInventory().getItem(14);
                    break;
                case SALMON:
                    p.closeInventory();
                    p.getInventory().addItem(bread, salmon);
                    p.getInventory().getItem(17);
                    break;
            }
        }



        e.setCancelled(true);
    }
}
