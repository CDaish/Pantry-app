package cd.personal.pantry.recipe;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {

    Collection<Recipe> findAllRecipesWithIngredients();

    @Query("select r from Recipe r inner join r.ingredients ingredients where ingredients.amount > ?1")
    List<Recipe> findByIngredients_AmountGreaterThan(float amount);

    @Query("""
            select r from Recipe r inner join r.ingredients ingredients
            where ingredients.amount > ?1 and ingredients.recipeId is not null""")
    List<Recipe> findByIngredients_AmountAndIngredients_RecipeIdIsNotNull(float amount);


}
