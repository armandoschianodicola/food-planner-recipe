package com.foodplanner.recipe.foodplannerrecipe.controller;

import com.foodplanner.recipe.foodplannerrecipe.entity.IngredientDto;
import com.foodplanner.recipe.foodplannerrecipe.model.Menu;
import com.foodplanner.recipe.foodplannerrecipe.model.request.MenuRequest;
import com.foodplanner.recipe.foodplannerrecipe.model.response.MenuResponse;
import com.foodplanner.recipe.foodplannerrecipe.model.response.MenuResponseTransformer;
import com.foodplanner.recipe.foodplannerrecipe.service.IngredientService;
import com.foodplanner.recipe.foodplannerrecipe.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/menu")
public class MenuController {

    @Autowired
    private MenuService service;

    @Autowired
    private MenuResponseTransformer transformer;

    @GetMapping("")
    public ResponseEntity<List<Menu>> get() {
        return new ResponseEntity<>(service.get(), HttpStatus.OK);
    }

    @PostMapping("create")
    public ResponseEntity<MenuResponse> create(@RequestParam String type) {
        service.create(type);
        MenuResponse menuResponse = transformer.map(type);
        return new ResponseEntity<>(menuResponse, HttpStatus.OK);
    }

}

