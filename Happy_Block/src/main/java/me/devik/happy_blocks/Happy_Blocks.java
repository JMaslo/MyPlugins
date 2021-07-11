package me.devik.happy_blocks;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Happy_Blocks extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getServer().getPluginManager().registerEvents(this, this);

    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        if (label.equals("happyblocks")) {
            player.sendMessage("Zapnul jsi plugin: The happy plugin!");
        }

        if (label.equals("endhappyblocks")) {
            player.sendMessage("Vypnul jsi plugin: The happy plugin");

        }
        return true;
    }

}
