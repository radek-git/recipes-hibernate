package com.radek.recipes.hibernate;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "products")
@Getter
@NoArgsConstructor
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PRODUCT")
    private Integer id;

    @Column(name = "PRODUCT_NAME")
    private String name;

    public Product(String name) {
        this.name = name;
    }

}
