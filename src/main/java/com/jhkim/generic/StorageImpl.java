package com.jhkim.generic;

public class StorageImpl<T> implements StorageType<T> {

    private T data;


    @Override
    public void set(T data) {
        this.data = data;
    }


    @Override
    public T get() {
        return data;
    }
}
