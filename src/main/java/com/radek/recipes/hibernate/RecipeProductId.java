package com.radek.recipes.hibernate;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
@Getter
@NoArgsConstructor
public class RecipeProductId implements Serializable {

    @ManyToOne(cascade = CascadeType.ALL)
    private Recipe recipe;

    @ManyToOne(cascade = CascadeType.ALL)
    private Product product;

    public RecipeProductId(Recipe recipe, Product product) {
        this.recipe = recipe;
        this.product = product;
    }
}
