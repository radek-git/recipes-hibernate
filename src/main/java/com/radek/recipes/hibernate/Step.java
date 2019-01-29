package com.radek.recipes.hibernate;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "steps")
@Getter
@NoArgsConstructor
public class Step implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_STEP")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_RECIPE", referencedColumnName = "ID_RECIPE")
    private Recipe recipe;

    @Column(name = "STEP_NUMBER")
    private int stepNr;

    @Column(name = "INSTRUCTIONS")
    private String instructions;

    public Step(Recipe recipe, int stepNr, String instructions) {
        this.recipe = recipe;
        this.stepNr = stepNr;
        this.instructions = instructions;
    }
}
