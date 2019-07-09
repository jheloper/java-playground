package com.jhkim.generic;

import java.util.Collection;

public class CollectionStorage<T> {

    private Collection<T> collection;


    public Collection<T> getCollection() {
        return collection;
    }


    public void setCollection(Collection<T> collection) {
        this.collection = collection;
    }
}
