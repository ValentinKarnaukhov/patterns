package com.github.valentinkarnaukhov.strategy;

/**
 * @author Valentin Karnaukhov
 */
public class NDSStrategy implements TaxStrategy {
    @Override
    public long calculateTax(long income) {
        return (long) (income * 0.2);
    }
}
