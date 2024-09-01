package com.foodplanner.recipe.foodplannerrecipe.model.request;

import com.foodplanner.recipe.foodplannerrecipe.entity.IngredientDto;
import lombok.Data;

import java.util.List;

@Data
public class RecipeRequest {

    private String name;
    private List<IngredientDto> ingredients;

}
