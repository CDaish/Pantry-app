package cd.personal.pantry.recipe;

import cd.personal.pantry.core.BaseController;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class RecipeController extends BaseController {


    private final RecipeRepository recipeRepository;

    public RecipeController(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @GetMapping("/recipes")
    public List<Recipe> getRecipes() {
        return (List<Recipe>) recipeRepository.findAll();
    }

    @PostMapping("/recipes")
    public ResponseEntity<String> addRecipe(@Valid @RequestBody Recipe user) {
        recipeRepository.save(user);
        return ResponseEntity.ok("Ingredient is valid");
    }

}