package com.foodplanner.recipe.foodplannerrecipe.model.response;

import com.foodplanner.recipe.foodplannerrecipe.entity.IngredientDto;
import lombok.Data;

import java.util.List;

@Data
public class RecipeResponse {

    private String name;
    private List<IngredientDto> ingredients;

}
