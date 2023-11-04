package com.foodplanner.recipe.foodplannerrecipe.entity;

import lombok.Data;

import java.util.List;

@Data
public class RecipeDto {

    private String name;
    private List<IngredientDto> ingredients;

}
