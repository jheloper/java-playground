package com.jhkim.generic;

import org.junit.Assert;
import org.junit.Test;

public class ChildStorageTest {

    @Test
    public void createChildStorage() {

        final String primaryData = "this is primary data.";
        final Integer secondaryData = 10;
        final Double tertiaryData = 5.5;

        final ChildStorage<String, Integer, Double> childStorage = new ChildStorage<>();

        childStorage.setPrimaryData(primaryData);
        childStorage.setSecondaryData(secondaryData);
        childStorage.setTertiaryData(tertiaryData);

        Assert.assertNotNull(childStorage);
        Assert.assertEquals(primaryData, childStorage.getPrimaryData());
        Assert.assertEquals(secondaryData, childStorage.getSecondaryData());
        Assert.assertEquals(tertiaryData, childStorage.getTertiaryData());
    }
}
