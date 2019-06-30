package com.jhkim.generic;

import org.junit.Assert;
import org.junit.Test;

public class StorageTest {

    @Test
    public void setAndGetStoredData() {

        final String data = "this is data.";

        Storage storage = new Storage();
        storage.setStoredData(data);

        // String 타입으로 캐스팅하는 코드를 넣지 않으면 컴파일 에러 발생.
        String storedData = (String) storage.getStoredData();
        Assert.assertEquals(data, storedData);
    }


    @Test
    public void setAndGetStoredDataWithMultipleTypes() {

        final Integer data = 1;
        // final String data = "this is data."
        // final Double data = 3.14;

        Storage storage = new Storage();
        storage.setStoredData(data);

        if(storage.getStoredData() instanceof String) {

            final String storedData = (String) storage.getStoredData();
            Assert.assertEquals(data, storedData);

        } else if(storage.getStoredData() instanceof Integer) {

            final Integer storedData = (Integer) storage.getStoredData();
            Assert.assertEquals(data, storedData);

        } else if(storage.getStoredData() instanceof Double) {

            final Double storedData = (Double) storage.getStoredData();
            Assert.assertEquals(data, storedData);

        } else {
            Assert.fail("unsupported type.");
        }
    }
}
