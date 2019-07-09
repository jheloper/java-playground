package com.jhkim.generic;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class CollectionStorageTest {

    @Test
    public void setAndGetCollection() {

        final List<Number> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);

        final CollectionStorage<Number> collectionStorage = new CollectionStorage<>();
        collectionStorage.setCollection(collection);

        Assert.assertEquals(collection, collectionStorage.getCollection());
    }
}
