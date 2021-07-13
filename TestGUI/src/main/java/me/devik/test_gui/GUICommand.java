package me.devik.test_gui;

import com.sun.tools.javac.jvm.Items;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class GUICommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player p = (Player) sender;

            ItemStack kill = new ItemStack(Material.TNT);
            ItemStack health = new ItemStack(Material.BREAD);
            ItemStack food = new ItemStack(Material.SALMON);

            ItemStack[] menu_items = {kill, health, food};

            Inventory gui = Bukkit.createInventory(p, 27, ChatColor.GOLD + "Test GUI");


            ItemMeta kill_meta = kill.getItemMeta();
            kill_meta.setDisplayName(ChatColor.RED + "Die");
            ArrayList<String> kill_lore = new ArrayList<>();
            kill_lore.add(ChatColor.GOLD + "Kill your self");
            kill_meta.setLore(kill_lore);
            kill.setItemMeta(kill_meta);

            ItemMeta health_meta = health.getItemMeta();
            health_meta.setDisplayName(ChatColor.BLUE + "Health");
            ArrayList<String> health_lore = new ArrayList<>();
            health_lore.add(ChatColor.YELLOW + "Set your health to 20.0");
            health_meta.setLore(health_lore);
            health.setItemMeta(health_meta);

            ItemMeta food_meta = food.getItemMeta();
            food_meta.setDisplayName(ChatColor.RED + "Food");
            ArrayList<String> food_lore = new ArrayList<>();
            food_lore.add(ChatColor.LIGHT_PURPLE + "Give you a food");
            food_meta.setLore(food_lore);
            food.setItemMeta(food_meta);


            gui.setContents(menu_items);
            p.openInventory(gui);

        }
        return true;
    }
}
