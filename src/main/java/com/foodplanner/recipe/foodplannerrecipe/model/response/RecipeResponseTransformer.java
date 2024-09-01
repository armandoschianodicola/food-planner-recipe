package com.foodplanner.recipe.foodplannerrecipe.model.response;

import com.foodplanner.recipe.foodplannerrecipe.entity.IngredientDto;
import com.foodplanner.recipe.foodplannerrecipe.entity.Recipe;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class RecipeResponseTransformer {

    public RecipeResponse map(Recipe recipe) {
        RecipeResponse recipeResponse = new RecipeResponse();
        recipeResponse.setName(recipe.getName());
        recipeResponse.setIngredients(recipe.getIngredients().stream().map(ingredient -> {
            IngredientDto ingredientDto = new IngredientDto();
            ingredientDto.setName(ingredient.getName());
            return ingredientDto;
        }).collect(Collectors.toList()));
        return recipeResponse;
    }
    
}
