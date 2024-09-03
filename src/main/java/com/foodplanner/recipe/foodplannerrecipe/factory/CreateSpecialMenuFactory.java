package com.foodplanner.recipe.foodplannerrecipe.factory;

import com.foodplanner.recipe.foodplannerrecipe.model.Menu;
import com.foodplanner.recipe.foodplannerrecipe.model.RegularMenu;
import com.foodplanner.recipe.foodplannerrecipe.model.SpecialMenu;

public class CreateSpecialMenuFactory extends CreateMenuFactory{

    @Override
    public Menu create(String type) {
        Menu menu = new SpecialMenu();
        System.out.println("created: " + menu);
        return menu;
    }

}
