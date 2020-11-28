package com.github.valentinkarnaukhov.command;

/**
 * @author Valentin Karnaukhov
 */
public class ChangeYPosCommand extends Command {

    public ChangeYPosCommand(Player player) {
        super(player);
    }

    @Override
    void execute(int delta) {
        super.player.changeYPos(delta);
    }
}
