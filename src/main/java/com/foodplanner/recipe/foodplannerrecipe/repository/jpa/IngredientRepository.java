package com.foodplanner.recipe.foodplannerrecipe.repository.jpa;

import com.foodplanner.recipe.foodplannerrecipe.entity.Ingredient;
import com.foodplanner.recipe.foodplannerrecipe.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {

    List<Ingredient> findByName(String name);

}
