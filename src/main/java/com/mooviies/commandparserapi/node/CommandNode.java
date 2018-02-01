package com.mooviies.commandparserapi.node;

import com.mooviies.commandparserapi.CommandInput;

import java.util.ArrayList;

public abstract class CommandNode {
    private String name;
    private Type type;

    protected CommandNode(String name, Type type)
    {
        this.name = name;
        this.type = type;
    }

    public String getName()
    {
        return name;
    }

    public Type getType()
    {
        return type;
    }

    public CommandNode getNextNode(ArrayList<String> command)
    {
        if(isValid(command.get(0)))
        {

        }

        return null;
    }

    public abstract String[] getAutocompleteList();
    public abstract boolean isValid(String value);
    public void onParsed(String value) {}

    public enum Type{
        BOOLEAN,
        STRING,

        BRANCH,
        NUMBER,
        POSITION,

        ENTITY,
        PLAYER,

        ITEM,
        BLOCK,
        ADVANCEMENT,
        ENCHANTMENT,
        STRUCTURE,

        JSON,
        COMMAND,

        CUSTOM
    }
}
