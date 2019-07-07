package com.jhkim.generic;

public class BeverageStorage<T extends Beverage> {

    private T beverage;


    public T getBeverage() {
        return beverage;
    }


    public void setBeverage(T beverage) {
        this.beverage = beverage;
    }
}
