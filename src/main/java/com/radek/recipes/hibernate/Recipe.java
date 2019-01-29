package com.radek.recipes.hibernate;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "recipes")
@NoArgsConstructor
@Getter
public class Recipe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_RECIPE", nullable = false)
    private Integer id;

    @Column(name = "RECIPE_NAME")
    private String name;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_RECIPE", referencedColumnName = "ID_RECIPE")
    private List<Step> steps = new ArrayList<>();

    public Recipe(String name, List<Step> steps) {
        this.name = name;
        this.steps = steps;
    }
}
