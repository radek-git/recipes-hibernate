package com.radek.recipes;

public interface Repository <T, K> {

    void add(T t);
    void delete(T t);
    T findById(K id);
}
