package com.github.valentinkarnaukhov.strategy;

/**
 * @author Valentin Karnaukhov
 */
public class USNStrategy implements TaxStrategy {
    @Override
    public long calculateTax(long income) {
        return (long) (income * 0.06);
    }
}
