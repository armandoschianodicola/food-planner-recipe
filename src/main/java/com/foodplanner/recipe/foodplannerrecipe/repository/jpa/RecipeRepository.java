package com.foodplanner.recipe.foodplannerrecipe.repository.jpa;

import com.foodplanner.recipe.foodplannerrecipe.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
