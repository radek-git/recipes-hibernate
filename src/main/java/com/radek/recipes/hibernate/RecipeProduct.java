package com.radek.recipes.hibernate;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "recipe_products")
@AssociationOverrides({
        @AssociationOverride(name = "id.recipe", joinColumns = @JoinColumn(name = "ID_RECIPE")),
        @AssociationOverride(name = "id.product", joinColumns = @JoinColumn(name = "ID_PRODUCT"))})
@NoArgsConstructor
public class RecipeProduct implements Serializable {

    @EmbeddedId
    private RecipeProductId id;

    @Getter
    @Column(name = "QUANTITY")
    private int quantity;

    public RecipeProduct(Recipe recipe, Product product, int quantity) {
        this.id = new RecipeProductId(recipe, product);
        this.quantity = quantity;
    }

    @Transient
    public Recipe getRecipe() {
        return id.getRecipe();
    }

    @Transient
    public Product getProduct() {
        return id.getProduct();
    }

}
