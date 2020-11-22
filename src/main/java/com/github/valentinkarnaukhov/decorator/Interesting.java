package com.github.valentinkarnaukhov.decorator;

/**
 * @author Valentin Karnaukhov
 */
public class Interesting {

    public static void main(String[] args) {
        Logger logger = new StdOutLogger();
        Logger jsonDecorator = new JsonDecorator(logger);
        SizeLimitDecorator sizeLimitDecorator = new SizeLimitDecorator(jsonDecorator);
        sizeLimitDecorator.setMaxLength(10);

        logger.log("HELLO WORLD!!!");
        jsonDecorator.log("HELLO WORLD!!!");
        sizeLimitDecorator.log("HELLO WORLD!!!");
    }

}
