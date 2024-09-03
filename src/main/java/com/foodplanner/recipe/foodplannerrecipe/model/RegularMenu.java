package com.foodplanner.recipe.foodplannerrecipe.model;

import lombok.Data;

@Data
public class RegularMenu implements Menu {

    private String type = "regular";

    public void build() {
        System.out.println("Building regular menu");
    }

    @Override
    public String toString() {
        return this.type;
    }
}
