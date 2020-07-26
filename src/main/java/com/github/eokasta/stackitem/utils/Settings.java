package com.github.eokasta.stackitem.utils;

import com.github.eokasta.stackitem.StackItemPlugin;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.bukkit.ChatColor;
import org.bukkit.entity.Item;
import org.bukkit.material.MaterialData;

@Data
@RequiredArgsConstructor
public class Settings {

    private final StackItemPlugin plugin;
    private final YamlConfig file;

    public boolean isStackable(MaterialData materialData) {
        return !file.getConfig().getStringList(
                "not-stackables").contains(materialData.getItemType().name() + ":" + materialData.getData()
        );
    }

    public int getLimit() {
        return file.getConfig().getInt("stack-limit", Integer.MAX_VALUE);
    }

    public boolean onLimitCompared(int amount, int amountCompared) {
        return amount + amountCompared > getLimit();
    }

    public int getRadius() {
        return file.getConfig().getInt("radius-to-stack", 10);
    }

    public String getShowName(Item item) {
        if (!file.getConfig().getBoolean("name.show", false))
            return null;

        final Replacer replacer = new Replacer();
        replacer.add("{quantity}", item.getItemStack().getAmount());
        replacer.add("{name}",
                item.getItemStack().getItemMeta().hasDisplayName()
                        ? item.getItemStack().getItemMeta().getDisplayName()
                        : MaterialName.valueOf(item).getName()
        );

        return ChatColor.translateAlternateColorCodes(
                '&',
                replacer.replace(file.getConfig().getString("name.format"))
        );
    }

    public void updateCustomName(Item item) {
        final String showName = plugin.getSettings().getShowName(item);
        if (showName != null) {
            item.setCustomNameVisible(true);
            item.setCustomName(showName);
        }
    }

}
