package me.heyxmirko.snowballeffect.listeners;

import org.bukkit.Effect;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.HashMap;
import java.util.Map;

public class HitEvent implements Listener {


    @EventHandler
    void playerHitEvent(ProjectileHitEvent event) {
        if (event.getEntity() instanceof Snowball) {
            if (event.getHitEntity() instanceof Player) {
                Player player = (Player) event.getHitEntity();
                    player.setFreezeTicks(100);
            }
        }
    }
}

