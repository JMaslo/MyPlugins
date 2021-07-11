package me.devik.happy_blocks.Event;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.java.JavaPlugin;

import static org.bukkit.Material.*;


public class Event extends JavaPlugin implements Listener {

    @EventHandler
    public void BlockPlace(BlockPlaceEvent e) {

        if (e.getBlockPlaced().getType() == SAND) {
            e.getBlock().setType(DIRT);
        }

        if (e.getBlockPlaced().getType() == DIRT) {
            e.getBlock().setType(SAND);
        }

        if (e.getBlockPlaced().getType() == STONE) {
            e.getBlock().setType(GRASS_BLOCK);
        }

        if (e.getBlockPlaced().getType() == BEDROCK) {
            e.getBlock().setType(GRAVEL);
        }

        if (e.getBlockPlaced().getType() == GOLD_BLOCK) {
            e.getBlock().setType(GOLD_ORE);
        }

        if (e.getBlockPlaced().getType() == IRON_BLOCK) {
            e.getBlock().setType(DIRT);
        }

        if (e.getBlockPlaced().getType() == ICE) {
            e.getBlock().setType(CACTUS);
        }

        if (e.getBlockPlaced().getType() == COAL_BLOCK) {
            e.getBlock().setType(COBBLESTONE);
        }

        if (e.getBlockPlaced().getType() == MYCELIUM) {
            e.getBlock().setType(SUGAR);
        }

        if (e.getBlockPlaced().getType() == OBSIDIAN) {
            e.getBlock().setType(OBSERVER);
        }

        if (e.getBlockPlaced().getType() == BOOKSHELF) {
            e.getBlock().setType(CHEST);
        }

        if (e.getBlockPlaced().getType() == CRAFTING_TABLE) {
            e.getBlock().setType(NETHERITE_BLOCK);
        }


    }
}
