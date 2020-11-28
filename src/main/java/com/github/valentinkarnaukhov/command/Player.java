package com.github.valentinkarnaukhov.command;

/**
 * @author Valentin Karnaukhov
 */
public class Player {
    private int x;
    private int y;

    public void changeXPos(int delta) {
        this.x += delta;
    }

    public void changeYPos(int delta) {
        this.y += delta;
    }

    @Override
    public String toString() {
        return "Player{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
