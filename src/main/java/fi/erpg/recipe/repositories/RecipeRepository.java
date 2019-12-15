package fi.erpg.recipe.repositories;

import fi.erpg.recipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
