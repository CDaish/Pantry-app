package cd.personal.pantry.recipe;

import cd.personal.pantry.core.BaseController;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class RecipeController extends BaseController {


    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/recipes")
    public List<Recipe> getRecipes() {
        return (List<Recipe>) recipeService.findAll();
    }

    @PostMapping("/recipes")
    public ResponseEntity<String> addRecipe(@Valid @RequestBody Recipe recipe) {
        recipeService.save(recipe);
        return ResponseEntity.ok("Ingredient is valid");
    }

    @GetMapping("/smartrecipes")
    public List<Recipe> getSmartRecipes() {
        return (List<Recipe>) recipeService.findAllRecipesWithIngredients();
    }

}