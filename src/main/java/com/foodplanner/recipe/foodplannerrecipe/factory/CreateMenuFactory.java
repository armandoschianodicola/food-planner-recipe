package com.foodplanner.recipe.foodplannerrecipe.factory;

import com.foodplanner.recipe.foodplannerrecipe.model.Menu;

public abstract class CreateMenuFactory {

    public abstract Menu create(String type);

}
