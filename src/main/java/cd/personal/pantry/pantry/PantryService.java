package cd.personal.pantry.pantry;

import cd.personal.pantry.ingredient.Ingredient;
import cd.personal.pantry.ingredient.IngredientRepository;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PantryService {

    private final IngredientRepository ingredientRepository;
    private Pantry pantry;
    private Map<Long, Ingredient> ingredientLookupMap;

    public PantryService(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    private void loadIngredients() {
        for (Ingredient ingredient : ingredientRepository.findAll()
        ) {
            ingredientLookupMap.put(ingredient.getId(), ingredient);
        }
    }

    public Pantry getPantry() {
        return pantry;
    }

    public void setPantry(Pantry pantry) {
        this.pantry = pantry;
    }
}
