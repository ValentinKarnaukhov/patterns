package com.github.valentinkarnaukhov.singleton;

/**
 * @author Valentin Karnaukhov
 */
public class Toilet {

    private static volatile Toilet instance;
    private boolean isOccupied;
    private String occupiedBy;

    private Toilet() {
    }

    public static Toilet getInstance() {
        if (instance != null) {
            return instance;
        }
        synchronized (Toilet.class) {
            if (instance == null) {
                instance = new Toilet();
            }
        }
        return instance;
    }

    public void use(String name) {
        if (isOccupied) {
            System.out.println("Occupied by" + occupiedBy + ", sorry " + name);
            return;
        }
        isOccupied = true;
        occupiedBy = name;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("POOP");
        isOccupied = false;
        occupiedBy = null;
    }


}
