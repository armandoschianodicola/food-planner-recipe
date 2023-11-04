package com.foodplanner.recipe.foodplannerrecipe.service;

import com.foodplanner.recipe.foodplannerrecipe.entity.IngredientDto;
import com.foodplanner.recipe.foodplannerrecipe.entity.Recipe;
import com.foodplanner.recipe.foodplannerrecipe.entity.RecipeDto;
import com.foodplanner.recipe.foodplannerrecipe.repository.jpa.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    private RecipeDto mapToDto(Recipe recipe) {
        RecipeDto recipeDto = new RecipeDto();
        recipeDto.setName(recipe.getName());
        recipeDto.setIngredients(recipe.getIngredients().stream().map(ingredient -> {
            IngredientDto ingredientDto = new IngredientDto();
            ingredientDto.setName(ingredient.getName());
            return ingredientDto;
        }).collect(Collectors.toList()));
        return new RecipeDto();
    }

    public List<RecipeDto> getRecipes() {

        List<Recipe> recipes = recipeRepository.findAll();

        return recipes.stream().map(this::mapToDto).toList();

    }
}
