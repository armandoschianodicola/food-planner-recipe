package com.foodplanner.recipe.foodplannerrecipe.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany
    private Set<Recipe> recipes;

    public String toString() {
        return name;
    }

}
