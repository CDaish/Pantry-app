package cd.personal.pantry.ingredient;

import cd.personal.pantry.core.BaseController;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class IngredientController extends BaseController {

    private final IngredientRepository ingredientRepository;

    public IngredientController(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @GetMapping("/ingredients")
    public List<Ingredient> getIngredients() {
        return (List<Ingredient>) ingredientRepository.findAll();
    }

    @PostMapping("/ingredients")
    public ResponseEntity<String> addIngredient(@Valid @RequestBody Ingredient user) {
        ingredientRepository.save(user);
        return ResponseEntity.ok("Ingredient is valid");
    }

}