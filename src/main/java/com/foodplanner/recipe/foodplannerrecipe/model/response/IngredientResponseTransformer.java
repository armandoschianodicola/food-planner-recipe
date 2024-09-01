package com.foodplanner.recipe.foodplannerrecipe.model.response;

import com.foodplanner.recipe.foodplannerrecipe.entity.Ingredient;
import com.foodplanner.recipe.foodplannerrecipe.entity.IngredientDto;
import com.foodplanner.recipe.foodplannerrecipe.entity.Recipe;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class IngredientResponseTransformer {

    public IngredientDto map(Ingredient ingredient) {
        IngredientDto ingredientDto = new IngredientDto();
        ingredientDto.setName(ingredient.getName());
        return ingredientDto;
    }
    
}
