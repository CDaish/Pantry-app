package cd.personal.pantry.recipe;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public List<Recipe> findAllRecipesWithIngredients() {
        return (List<Recipe>) recipeRepository.findAllRecipesWithIngredients();
    }

    public void save(Recipe recipe) {
        recipeRepository.save(recipe);
    }

    public Object findAll() {
        return recipeRepository.findAll();
    }
}
