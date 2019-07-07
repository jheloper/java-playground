package com.jhkim.generic;

import org.junit.Assert;
import org.junit.Test;

public class BeverageStorageTest {

    @Test
    public void setAndGetBeverage() {

        final Beverage beverage = new Beverage();

        final BeverageStorage<Beverage> beverageStorage = new BeverageStorage<>();
        beverageStorage.setBeverage(beverage);

        beverageStorage.getBeverage().drink();
        Assert.assertEquals(beverage, beverageStorage.getBeverage());
    }


    @Test
    public void setAndGetCoke() {

        final Coke coke = new Coke();

        final BeverageStorage<Coke> cokeStorage = new BeverageStorage<>();
        cokeStorage.setBeverage(coke);

        cokeStorage.getBeverage().drink();
        Assert.assertEquals(coke, cokeStorage.getBeverage());
    }


    @Test
    public void setAndGetCoffee() {

        final Coffee coffee = new Coffee();

        final BeverageStorage<Coffee> coffeeStorage = new BeverageStorage<>();
        coffeeStorage.setBeverage(coffee);

        coffeeStorage.getBeverage().drink();
        Assert.assertEquals(coffee, coffeeStorage.getBeverage());
    }


    @Test
    public void setAndGetBeer() {

        final Beer beer = new Beer();

        final BeverageStorage<Beer> beerStorage = new BeverageStorage<>();
        beerStorage.setBeverage(beer);

        beerStorage.getBeverage().drink();
        Assert.assertEquals(beer, beerStorage.getBeverage());
    }
}
