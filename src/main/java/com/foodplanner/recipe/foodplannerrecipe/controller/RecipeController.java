package com.foodplanner.recipe.foodplannerrecipe.controller;

import com.foodplanner.recipe.foodplannerrecipe.entity.RecipeDto;
import com.foodplanner.recipe.foodplannerrecipe.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "api/v1/recipe")
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @GetMapping("/")
    public ResponseEntity<RecipeDto> getRecipes() {
        return new ResponseEntity<>(recipeService.getRecipes(), HttpStatus.OK) ;
    }






}
