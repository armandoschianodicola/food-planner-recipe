package com.foodplanner.recipe.foodplannerrecipe.controller;

import com.foodplanner.recipe.foodplannerrecipe.entity.IngredientDto;
import com.foodplanner.recipe.foodplannerrecipe.model.request.RecipeRequest;
import com.foodplanner.recipe.foodplannerrecipe.model.response.RecipeResponse;
import com.foodplanner.recipe.foodplannerrecipe.service.IngredientService;
import com.foodplanner.recipe.foodplannerrecipe.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "api/v1/ingredient")
public class IngredientController {

    @Autowired
    private IngredientService service;

    @GetMapping("")
    public ResponseEntity<List<IngredientDto>> getRecipes() {
        return new ResponseEntity<>(service.get(), HttpStatus.OK) ;
    }

}
