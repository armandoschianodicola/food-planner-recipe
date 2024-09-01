package com.foodplanner.recipe.foodplannerrecipe.model.request;

import com.foodplanner.recipe.foodplannerrecipe.entity.Ingredient;
import com.foodplanner.recipe.foodplannerrecipe.entity.Recipe;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class RecipeRequestTransformer {

    public Recipe map(RecipeRequest recipeRequest) {
        Recipe recipe = new Recipe();
        recipe.setName(recipeRequest.getName());
        recipe.setIngredients(recipeRequest.getIngredients().stream().map(ingredient -> {
            Ingredient newIngredient = new Ingredient();
            newIngredient.setName(ingredient.getName());
            return newIngredient;
        }).collect(Collectors.toSet()));
        return recipe;
    }

}
