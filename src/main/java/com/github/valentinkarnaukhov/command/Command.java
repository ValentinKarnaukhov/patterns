package com.github.valentinkarnaukhov.command;

/**
 * @author Valentin Karnaukhov
 */
public abstract class Command {

    protected final Player player;

    public Command(Player player) {
        this.player = player;
    }

    abstract void execute(int delta);

}
