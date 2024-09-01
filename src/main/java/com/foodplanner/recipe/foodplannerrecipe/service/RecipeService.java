package com.foodplanner.recipe.foodplannerrecipe.service;

import com.foodplanner.recipe.foodplannerrecipe.entity.Ingredient;
import com.foodplanner.recipe.foodplannerrecipe.entity.IngredientDto;
import com.foodplanner.recipe.foodplannerrecipe.entity.Recipe;
import com.foodplanner.recipe.foodplannerrecipe.model.request.RecipeRequest;
import com.foodplanner.recipe.foodplannerrecipe.model.request.RecipeRequestTransformer;
import com.foodplanner.recipe.foodplannerrecipe.model.response.RecipeResponse;
import com.foodplanner.recipe.foodplannerrecipe.model.response.RecipeResponseTransformer;
import com.foodplanner.recipe.foodplannerrecipe.repository.jpa.IngredientRepository;
import com.foodplanner.recipe.foodplannerrecipe.repository.jpa.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    @Autowired
    private IngredientRepository ingredientRepository;

    @Autowired
    private RecipeRequestTransformer recipeRequestTransformer;

    @Autowired
    private RecipeResponseTransformer recipeResponseTransformer;

    public List<RecipeResponse> getRecipes() {

        List<Recipe> recipes = recipeRepository.findAll();

        return recipes.stream().map(recipe -> recipeResponseTransformer.map(recipe)).collect(Collectors.toList());

    }

    public RecipeResponse add(RecipeRequest recipeRequest) {

        try {
            Recipe recipe = recipeRequestTransformer.map(recipeRequest);
            recipe.getIngredients().forEach(ingredient -> {
                List<Ingredient> ingredients = ingredientRepository.findByName(ingredient.getName());
                if (ingredients.isEmpty()) {
                    ingredientRepository.save(ingredient);
                }
            });
            Recipe newRecipe = recipeRepository.save(recipe);
            return recipeResponseTransformer.map(newRecipe);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}




