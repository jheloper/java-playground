package com.jhkim.generic;

import org.junit.Assert;
import org.junit.Test;

public class StorageTest {

    @Test
    public void setAndGetStoredData() {

        final String data = "this is data.";

        Storage storage = new Storage();
        storage.setStoredData(data);

        String storedData = (String) storage.getStoredData();
        Assert.assertEquals(data, storedData);
    }
}
