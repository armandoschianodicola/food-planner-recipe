package com.foodplanner.recipe.foodplannerrecipe.service;

import com.foodplanner.recipe.foodplannerrecipe.entity.Ingredient;
import com.foodplanner.recipe.foodplannerrecipe.entity.IngredientDto;
import com.foodplanner.recipe.foodplannerrecipe.factory.CreateMenuFactory;
import com.foodplanner.recipe.foodplannerrecipe.factory.CreateRegularMenuFactory;
import com.foodplanner.recipe.foodplannerrecipe.factory.CreateSpecialMenuFactory;
import com.foodplanner.recipe.foodplannerrecipe.model.Menu;
import com.foodplanner.recipe.foodplannerrecipe.model.response.IngredientResponseTransformer;
import com.foodplanner.recipe.foodplannerrecipe.repository.jpa.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MenuService {

    public List<Menu> get() {

        return null;

    }

    public Menu create(String type) {

        CreateMenuFactory menuFactory;

        switch (type) {

            case "regular":
                menuFactory = new CreateRegularMenuFactory();
                return menuFactory.create(type);

            case "special":
                menuFactory = new CreateSpecialMenuFactory();
                return menuFactory.create(type);

            default:
                return null;

        }

    }

}




