package com.jhkim.generic;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class GenericStorageTest {

    @Test
    public void setAndGetInGenericStorage() {

        final Integer data = 1;
        final String secondaryData = "this is data.";

        GenericStorage<Integer, String> storage = new GenericStorage<>();
        storage.setStoredData(data);
        storage.setSecondaryData(secondaryData);

        Assert.assertEquals(data, storage.getStoredData());
        Assert.assertEquals(secondaryData, storage.getSecondaryData());
    }


    @Test
    public void wrapList() {

        final String data = "this is data.";

        GenericStorage<Integer, Double> storage = new GenericStorage<>();
        final List<String> stringList = storage.<String>wrapList(data);
        // final List<String> stringList = storage.wrapList(data);

        Assert.assertEquals(data, stringList.get(0));
    }
}
