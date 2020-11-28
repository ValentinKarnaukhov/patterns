package com.github.valentinkarnaukhov.command;

/**
 * @author Valentin Karnaukhov
 */
public class Area {

    public static void main(String[] args) {
        Player player = new Player();
        Button left = new LeftArrowButton(new ChangeXPosCommand(player));
        Button right = new DButton(new ChangeXPosCommand(player));
        Button up = new UpArrowButton(new ChangeYPosCommand(player));
        Button down = new SButton(new ChangeYPosCommand(player));

        System.out.println(player);
        left.onClick();
        System.out.println(player);
        up.onClick();
        System.out.println(player);
        right.onClick();
        System.out.println(player);
        down.onClick();
        System.out.println(player);
    }

    private static class LeftArrowButton implements Button {
        private final Command onClick;

        public LeftArrowButton(Command onClick) {
            this.onClick = onClick;
        }

        public void onClick() {
            this.onClick.execute(-1);
        }
    }

    private static class UpArrowButton implements Button {
        private final Command onClick;

        private UpArrowButton(Command onClick) {
            this.onClick = onClick;
        }

        public void onClick() {
            this.onClick.execute(1);
        }
    }

    private static class SButton implements Button {
        private final Command onClick;

        private SButton(Command onClick) {
            this.onClick = onClick;
        }

        public void onClick() {
            this.onClick.execute(-1);
        }
    }

    private static class DButton implements Button {
        private final Command onClick;

        private DButton(Command onClick) {
            this.onClick = onClick;
        }

        public void onClick() {
            this.onClick.execute(1);
        }
    }

    private interface Button {
        void onClick();
    }
}
