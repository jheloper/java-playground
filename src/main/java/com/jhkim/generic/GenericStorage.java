package com.jhkim.generic;

public class GenericStorage<T> {

    private T storedData;


    public T getStoredData() {
        return storedData;
    }


    public void setStoredData(T storedData) {
        this.storedData = storedData;
    }
}
