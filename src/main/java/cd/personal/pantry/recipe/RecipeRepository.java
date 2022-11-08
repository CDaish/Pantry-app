package cd.personal.pantry.recipe;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {

    Collection<Recipe> findAllRecipesWithIngredients();
    Collection<Recipe> findAllRecipesWithIngredientsInStock();
}
