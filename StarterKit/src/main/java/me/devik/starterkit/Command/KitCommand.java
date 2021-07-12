package me.devik.starterkit.Command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class KitCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player p = (Player) sender;

            ItemStack food = new ItemStack(Material.SALMON);
            ItemStack armor = new ItemStack(Material.DIAMOND_CHESTPLATE);
            ItemStack weapons = new ItemStack(Material.DIAMOND_SWORD);
            ItemStack[] menu_items = {food, armor, weapons};

            Inventory kit = Bukkit.createInventory(p, 9, ChatColor.AQUA + "Starter Kit");
            //Names of armor, food, weapons
            ItemMeta food_meta = food.getItemMeta();
            food_meta.setDisplayName(ChatColor.YELLOW + "Food");
            ArrayList<String> food_lore = new ArrayList<>();
            food_lore.add(ChatColor.GOLD + "You can take some food");
            food_meta.setLore(food_lore);
            food.setItemMeta(food_meta);


            ItemMeta armor_meta = armor.getItemMeta();
            armor_meta.setDisplayName(ChatColor.BLUE + "Armor");
            ArrayList<String> armor_lore = new ArrayList<>();
            armor_lore.add(ChatColor.GOLD + "You can take stone armor");
            armor_meta.setLore(armor_lore);
            armor.setItemMeta(armor_meta);

            ItemMeta weapons_meta = weapons.getItemMeta();
            weapons_meta.setDisplayName(ChatColor.RED + "Weapons");
            ArrayList<String> weapons_lore = new ArrayList<>();
            weapons_lore.add(ChatColor.GOLD + "You can take stone weapons");
            weapons_meta.setLore(food_lore);
            weapons.setItemMeta(weapons_meta);








            kit.setContents(menu_items);


            p.openInventory(kit);
        }




        return true;
    }
}
