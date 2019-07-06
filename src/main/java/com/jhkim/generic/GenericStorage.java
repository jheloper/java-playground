package com.jhkim.generic;

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
}
