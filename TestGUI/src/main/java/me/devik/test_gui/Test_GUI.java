package me.devik.test_gui;


import org.bukkit.plugin.java.JavaPlugin;

public final class Test_GUI extends JavaPlugin{

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("gui").setExecutor(new GUICommand());
        getServer().getPluginManager().registerEvents(new GUIEvent(), this);

    }

}
