package com.foodplanner.recipe.foodplannerrecipe.controller;

import com.foodplanner.recipe.foodplannerrecipe.model.request.RecipeRequest;
import com.foodplanner.recipe.foodplannerrecipe.model.response.RecipeResponse;
import com.foodplanner.recipe.foodplannerrecipe.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "api/v1/recipe")
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @GetMapping("")
    public ResponseEntity<List<RecipeResponse>> getRecipes() {
        return new ResponseEntity<>(recipeService.getRecipes(), HttpStatus.OK) ;
    }

    @PostMapping("")
    public ResponseEntity<RecipeResponse> add(@RequestBody RecipeRequest recipeRequest) {
        return new ResponseEntity<>(recipeService.add(recipeRequest), HttpStatus.OK);
    }

}
