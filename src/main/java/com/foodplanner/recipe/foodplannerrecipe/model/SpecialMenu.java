package com.foodplanner.recipe.foodplannerrecipe.model;

import lombok.Data;

@Data
public class SpecialMenu implements Menu {

    private final String type = "special";

    public void build() {
        System.out.println("Building special menu");
    }

    @Override
    public String toString() {
        return this.type;
    }
}
