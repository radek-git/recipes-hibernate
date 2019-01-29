package com.radek.recipes.hibernate;

import com.radek.recipes.JPARepository;

public class ProductRepository extends JPARepository<Product, Integer> {

    public ProductRepository(Class<Product> clazz) {
        super(clazz);
    }


}
