package com.jhkim.generic;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class CollectionStorageTest {

    @Test
    public void setAndGetCollection() {

        final List<Number> collection = new ArrayList<>();
        // Integer 클래스는 Number 클래스를 상속했지만 파라미터로 할당하면 컴파일 에러 발생
        // final List<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);

        final CollectionStorage<Number> collectionStorage = new CollectionStorage<>();
        collectionStorage.setCollection(collection);

        Assert.assertEquals(collection, collectionStorage.getCollection());
    }
}
