package com.github.eokasta.stackitem;

import org.bukkit.Bukkit;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ItemSpawnEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;

public class ItemSpawnListener implements Listener {

    private final StackItemPlugin plugin;

    public ItemSpawnListener(StackItemPlugin plugin) {
        this.plugin = plugin;
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.HIGH)
    public void onDrop(ItemSpawnEvent event) {
        final Item item = event.getEntity();
        if (!plugin.getSettings().isStackable(item.getItemStack().getData()))
            return;

        final int radius = plugin.getSettings().getRadius();
        final Item nearbyItem = (Item) item.getNearbyEntities(radius, radius, radius).stream().filter(
                entity -> entity instanceof Item &&
                        ((Item) entity).getItemStack().isSimilar(item.getItemStack()) &&
                        !plugin.getSettings().onLimitCompared(
                                item.getItemStack().getAmount(), ((Item) entity).getItemStack().getAmount())
        ).findFirst().orElse(null);

        if (nearbyItem == null) {
            plugin.getSettings().updateCustomName(item);
            return;
        }

        nearbyItem.getItemStack().setAmount(nearbyItem.getItemStack().getAmount() + item.getItemStack().getAmount());

        plugin.getSettings().updateCustomName(nearbyItem);

        event.setCancelled(true);
    }

    @EventHandler
    public void onPickup(PlayerPickupItemEvent event) {
        final Item item = event.getItem();
        Bukkit.getScheduler().scheduleSyncDelayedTask(
                plugin, () -> plugin.getSettings().updateCustomName(item), 1
        );
    }
}
