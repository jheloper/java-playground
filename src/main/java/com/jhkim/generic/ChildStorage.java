package com.jhkim.generic;

public class ChildStorage<T, U, V> extends ParentStorage<T, U> {

    private V tertiaryData;


    public V getTertiaryData() {
        return tertiaryData;
    }


    public void setTertiaryData(V tertiaryData) {
        this.tertiaryData = tertiaryData;
    }
}
