package fi.erpg.recipe.repositories;

import fi.erpg.recipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
