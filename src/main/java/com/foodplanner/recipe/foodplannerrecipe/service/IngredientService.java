package com.foodplanner.recipe.foodplannerrecipe.service;

import com.foodplanner.recipe.foodplannerrecipe.entity.Ingredient;
import com.foodplanner.recipe.foodplannerrecipe.entity.IngredientDto;
import com.foodplanner.recipe.foodplannerrecipe.entity.Recipe;
import com.foodplanner.recipe.foodplannerrecipe.model.request.RecipeRequest;
import com.foodplanner.recipe.foodplannerrecipe.model.request.RecipeRequestTransformer;
import com.foodplanner.recipe.foodplannerrecipe.model.response.IngredientResponseTransformer;
import com.foodplanner.recipe.foodplannerrecipe.model.response.RecipeResponse;
import com.foodplanner.recipe.foodplannerrecipe.model.response.RecipeResponseTransformer;
import com.foodplanner.recipe.foodplannerrecipe.repository.jpa.IngredientRepository;
import com.foodplanner.recipe.foodplannerrecipe.repository.jpa.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class IngredientService {

    @Autowired
    private IngredientRepository ingredientRepository;

    @Autowired
    private IngredientResponseTransformer responseTransformer;

    public List<IngredientDto> get() {

        List<Ingredient> ingredients = ingredientRepository.findAll();

        return ingredients.stream().map(ingredient -> responseTransformer.map(ingredient)).collect(Collectors.toList());

    }

}




