package com.mooviies.commandparserapi;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class CommandParserAPI extends JavaPlugin{
    public String pluginFolder = getDataFolder().getAbsolutePath();
    private static CommandParserAPI instance;

    public static CommandParserAPI getInstance()
    {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
    }

    @Override
    public void onDisable() {

    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        return true;
    }
}
