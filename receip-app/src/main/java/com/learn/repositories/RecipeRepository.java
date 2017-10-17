package com.learn.repositories;

import org.springframework.data.repository.CrudRepository;

import com.learn.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
