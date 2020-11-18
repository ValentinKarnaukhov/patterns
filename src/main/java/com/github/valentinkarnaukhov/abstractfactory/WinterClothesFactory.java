package com.github.valentinkarnaukhov.abstractfactory;

/**
 * @author Valentin Karnaukhov
 */
public class WinterClothesFactory implements ClothesFactory {
    public Headdress createHeaddress() {
        return new WinterHeaddress();
    }

    public Pants createPants() {
        return new WinterPants();
    }

    public Shoes createShoes() {
        return new WinterShoes();
    }
}
