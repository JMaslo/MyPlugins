package me.devik.tournament.Command;

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

public class TournamentCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player p = (Player) sender;

            ItemStack plus_diamond = new ItemStack(Material.DIAMOND); //ItemStacks (materials)
            ItemStack minus_emerald = new ItemStack(Material.EMERALD);
            ItemStack start_clock = new ItemStack(Material.CLOCK);
            ItemStack window = new ItemStack(Material.PURPLE_STAINED_GLASS_PANE);
            ItemStack[] menu_items = {plus_diamond, minus_emerald, start_clock}; //All itemstacks in one

            Inventory tournament = Bukkit.createInventory(p, 36, ChatColor.BLUE + "Tournament"); //Create a GUI tournament

            ItemMeta plus_meta = plus_diamond.getItemMeta();
            plus_meta.setDisplayName(ChatColor.YELLOW + "Plus");
            ArrayList<String> plus_lore = new ArrayList<>();
            plus_lore.add(ChatColor.GOLD + "Plus 30 seconds");
            plus_meta.setLore(plus_lore);
            plus_diamond.setItemMeta(plus_meta);

            ItemMeta minus_meta = minus_emerald.getItemMeta();
            minus_meta.setDisplayName(ChatColor.YELLOW + "Minus");
            ArrayList<String> minus_lore = new ArrayList<>();
            minus_lore.add(ChatColor.GOLD + "Minus 10 seconds");
            minus_meta.setLore(minus_lore);
            minus_emerald.setItemMeta(minus_meta);

            ItemMeta start_meta = start_clock.getItemMeta();
            start_meta.setDisplayName(ChatColor.YELLOW + "Food");
            ArrayList<String> start_lore = new ArrayList<>();
            start_lore.add(ChatColor.GOLD + "You can take some food");
            start_meta.setLore(start_lore);
            start_clock.setItemMeta(start_meta);


            tournament.setContents(menu_items);
            p.openInventory(tournament);

        }
        return true;
    }
}
