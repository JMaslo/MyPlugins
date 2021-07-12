package me.devik.starterkit.Event;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;



public class ClickEvent implements Listener {



    @EventHandler
    public void onMenuClick(InventoryClickEvent e){

        ItemStack helma = new ItemStack(Material.LEATHER_HELMET);
        ItemStack chestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemStack kalhoty = new ItemStack(Material.LEATHER_LEGGINGS);
        ItemStack boty = new ItemStack(Material.LEATHER_BOOTS);

        ItemStack sword = new ItemStack(Material.STONE_SWORD);
        ItemStack pickaxe = new ItemStack(Material.STONE_PICKAXE);
        ItemStack axe = new ItemStack(Material.STONE_AXE);
        ItemStack shovel = new ItemStack(Material.STONE_SHOVEL);
        ItemStack hoe = new ItemStack(Material.STONE_HOE);

        ItemStack bread = new ItemStack(Material.BREAD, 64);
        ItemStack fish = new ItemStack(Material.SALMON, 64);

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
