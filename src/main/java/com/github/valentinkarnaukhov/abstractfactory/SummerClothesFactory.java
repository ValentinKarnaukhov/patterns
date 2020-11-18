package com.github.valentinkarnaukhov.abstractfactory;

/**
 * @author Valentin Karnaukhov
 */
public class SummerClothesFactory implements ClothesFactory {
    public Headdress createHeaddress() {
        return new SummerHeaddress();
    }

    public Pants createPants() {
        return new SummerPants();
    }

    public Shoes createShoes() {
        return new SummerShoes();
    }
}
