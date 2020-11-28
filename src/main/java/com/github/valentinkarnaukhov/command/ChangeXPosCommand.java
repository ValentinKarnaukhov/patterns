package com.github.valentinkarnaukhov.command;

/**
 * @author Valentin Karnaukhov
 */
public class ChangeXPosCommand extends Command{
    public ChangeXPosCommand(Player player) {
        super(player);
    }

    @Override
    void execute(int delta) {
        super.player.changeXPos(delta);
    }
}
