package com.jhkim.generic;

public class ParentStorage<T, U> {

    private T primaryData;

    private U secondaryData;


    public T getPrimaryData() {
        return primaryData;
    }


    public void setPrimaryData(T primaryData) {
        this.primaryData = primaryData;
    }


    public U getSecondaryData() {
        return secondaryData;
    }


    public void setSecondaryData(U secondaryData) {
        this.secondaryData = secondaryData;
    }
}
