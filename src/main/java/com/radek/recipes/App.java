package com.radek.recipes;

import com.radek.recipes.hibernate.Product;
import com.radek.recipes.hibernate.ProductRepository;

public class App {

    public static void main(String[] args) {

        var productRepository = new ProductRepository(Product.class);
        var product = productRepository.findById(1);

        System.out.println(product.getName());

//        var database = Database.getInstance();
//
//        Optional<Recipe> optionalRecipe = database.getRecipeByName("kotlet");
//
//        System.out.println(optionalRecipe.isPresent());
//        System.out.println(optionalRecipe.get().getId());
//
//        optionalRecipe.get()
//                .getSteps()
//                .stream()
//                .sorted(Comparator.comparingInt(Step::getStepNr))
//                .forEach(step -> System.out.println(step.getStepNr() + " " + step.getInstructions()));


    }
}
