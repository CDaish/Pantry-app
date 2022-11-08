package cd.personal.pantry.pantry;

import cd.personal.pantry.ingredient.IngredientRepository;
import cd.personal.pantry.recipe.Recipe;
import cd.personal.pantry.recipe.RecipeService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class PantryController {


    private final PantryRepository pantryRepository;

    public PantryController(PantryRepository pantryRepository) {
        this.pantryRepository = pantryRepository;
    }

    @GetMapping("/pantry")
    public List<Pantry> getPantry() {
        return (List<Pantry>) pantryRepository.findAll();
    }

    @PostMapping("/pantry")
    public ResponseEntity<String> addRecipe(@Valid @RequestBody Recipe recipe) {
        return ResponseEntity.ok("Ingredient is valid");
    }

    @GetMapping("/smartrecipes")
    public List<Recipe> getSmartRecipes() {
        return null;
    }
}
