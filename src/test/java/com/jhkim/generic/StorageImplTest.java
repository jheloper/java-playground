package com.jhkim.generic;

import org.junit.Assert;
import org.junit.Test;

public class StorageImplTest {

    @Test
    public void setAndGet() {

        final String data = "this is data.";

        final StorageType<String> storage = new StorageImpl<>();

        storage.set(data);

        Assert.assertNotNull(storage);
        Assert.assertEquals(data, storage.get());
    }
}
