package com.github.valentinkarnaukhov.strategy;

/**
 * @author Valentin Karnaukhov
 */
public class Company {

    private long income;

    public Company() {
        this.income = 0;
    }

    public void addIncome(long income) {
        this.income += income;
    }

    public long getIncome() {
        return income;
    }
}
