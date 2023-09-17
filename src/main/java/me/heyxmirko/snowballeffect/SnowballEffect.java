package me.heyxmirko.snowballeffect;

import me.heyxmirko.snowballeffect.listeners.HitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class SnowballEffect extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("The plugins has been loaded!");
        registerListeners();
    }

    void registerListeners() {
        getServer().getPluginManager().registerEvents(new HitEvent(), this);
        getLogger().info("Registered listeners!");
    }

    @Override
    public void onDisable() {
        getLogger().info("The plugins has been unloaded!");
    }
}
