package me.devik.starterkit;

import me.devik.starterkit.Command.KitCommand;
import me.devik.starterkit.Event.ClickEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class StarterKit extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("starterkit").setExecutor(new KitCommand());
        getServer().getPluginManager().registerEvents(new ClickEvent(), this);
    }

}
