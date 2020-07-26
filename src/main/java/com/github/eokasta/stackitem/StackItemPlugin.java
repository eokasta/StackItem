package com.github.eokasta.stackitem;

import com.github.eokasta.stackitem.utils.Settings;
import com.github.eokasta.stackitem.utils.YamlConfig;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
public class StackItemPlugin extends JavaPlugin {

    private Settings settings;

    @Override
    public void onEnable() {
        this.settings = new Settings(
                this, new YamlConfig("config.yml", this, true)
        );

        new ItemSpawnListener(this);
        new StackItemCommand(this);
    }

    @Override
    public void onDisable() {

    }

}
