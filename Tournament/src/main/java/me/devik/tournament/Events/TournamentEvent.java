package me.devik.tournament.Events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class TournamentEvent implements Listener {

    @EventHandler
    public void onMenuCLick(InventoryClickEvent e){
        Player p = (Player) e.getWhoClicked();

        if(e.getView().getTitle().equalsIgnoreCase(ChatColor.BLUE + "Tournament")){
            switch (e.getCurrentItem().getType()){
                case DIAMOND:
                    p.getInventory().getItem(26);

                case CLOCK:
                    p.getInventory().getItem(14);

                case EMERALD:
                    p.getInventory().getItem(20);

                case PURPLE_STAINED_GLASS_PANE:
                    p.getInventory().getItem(1, 2, 3,);
                    p.closeInventory();
                    p.sendMessage(ChatColor.BLUE + "Please don't touch to these glass panes, thank you :)");

            }
        }
    }

}
