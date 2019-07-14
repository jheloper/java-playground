package com.jhkim.generic;

public interface StorageType<T> {

    void set(T data);

    T get();
}
