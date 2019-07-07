package com.jhkim.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericStorage<T, U> {

    private T storedData;

    private U secondaryData;


    public T getStoredData() {
        return storedData;
    }


    public void setStoredData(T storedData) {
        this.storedData = storedData;
    }


    public U getSecondaryData() {
        return secondaryData;
    }


    public void setSecondaryData(U secondaryData) {
        this.secondaryData = secondaryData;
    }


    public <E> List<E> wrapList(E e) {
        List<E> list = new ArrayList<>();
        list.add(e);
        return list;
    }
}
