package me.devik.starterkit.Event;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import static org.bukkit.Material.*;

public class ClickEvent implements Listener {

    @EventHandler
    public void onMenuClick(InventoryClickEvent e){

        ItemStack helma = new ItemStack(LEATHER_HELMET);
        ItemStack chestplate = new ItemStack(LEATHER_CHESTPLATE);
        ItemStack kalhoty = new ItemStack(LEATHER_LEGGINGS);
        ItemStack boty = new ItemStack(LEATHER_BOOTS);

        ItemStack sword = new ItemStack(STONE_SWORD);
        ItemStack pickaxe = new ItemStack(STONE_PICKAXE);
        ItemStack axe = new ItemStack(STONE_AXE);
        ItemStack shovel = new ItemStack(STONE_SHOVEL);
        ItemStack hoe = new ItemStack(STONE_HOE);

        ItemStack bread = new ItemStack(BREAD, 64);
        ItemStack fish = new ItemStack(SALMON, 64);

        Player p = (Player) e.getWhoClicked();

        if(e.getView().getTitle().equalsIgnoreCase(ChatColor.AQUA + "Starter Kit")){

            switch (e.getCurrentItem().getType()){
                case SALMON:
                    p.getInventory().addItem(bread, fish);
                    p.sendMessage(ChatColor.BLUE + "[Server]" + ChatColor.RED + "You have some food now.");
                    break;
                case DIAMOND_CHESTPLATE:
                    p.getInventory().addItem(helma, chestplate, kalhoty, boty);
                    p.sendMessage(ChatColor.BLUE + "[Server]" + ChatColor.RED + "You have leather armor now.");
                    break;
                case DIAMOND_SWORD:
                    p.getInventory().addItem(sword, pickaxe, axe, shovel, hoe);
                    p.sendMessage(ChatColor.BLUE + "[Server]" + ChatColor.RED + "You have stone weapons now.");
                    break;
            }
            e.setCancelled(true);
        }






    }
}
