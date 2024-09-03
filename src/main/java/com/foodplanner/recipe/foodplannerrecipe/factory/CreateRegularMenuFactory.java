package com.foodplanner.recipe.foodplannerrecipe.factory;

import com.foodplanner.recipe.foodplannerrecipe.model.Menu;
import com.foodplanner.recipe.foodplannerrecipe.model.RegularMenu;

public class CreateRegularMenuFactory extends CreateMenuFactory {

    @Override
    public Menu create(String type) {
        Menu menu = new RegularMenu();
        System.out.println("created: " + menu);
        return menu;
    }
}
