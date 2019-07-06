package com.jhkim.generic;

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
}
