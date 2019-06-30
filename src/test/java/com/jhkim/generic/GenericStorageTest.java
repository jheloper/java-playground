package com.jhkim.generic;

import org.junit.Assert;
import org.junit.Test;

public class GenericStorageTest {

    @Test
    public void setAndGetStoredDataWithMultipleTypes() {

        final Integer data = 1;
        // final String data = "this is data."
        // final Double data = 3.14;

        GenericStorage<Integer> storage = new GenericStorage<>();
        // GenericStorage<String> storage = new GenericStorage<>();
        // GenericStorage<Double> storage = new GenericStorage<>();
        storage.setStoredData(data);

        Assert.assertEquals(data, storage.getStoredData());
    }
}
