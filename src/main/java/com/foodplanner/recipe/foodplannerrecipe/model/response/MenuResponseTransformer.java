package com.foodplanner.recipe.foodplannerrecipe.model.response;

import com.foodplanner.recipe.foodplannerrecipe.model.Menu;
import org.springframework.stereotype.Component;

@Component
public class MenuResponseTransformer {

    public MenuResponse map(String type) {

        MenuResponse response = new MenuResponse();
        response.setType(type);

        return response;

    }

}
