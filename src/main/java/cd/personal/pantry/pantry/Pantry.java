package cd.personal.pantry.pantry;

import cd.personal.pantry.ingredient.Ingredient;

import java.util.Map;

public class Pantry {

    private long id;
    private Map<Integer, Ingredient> idToIngredientLookupMap;
    private Map<Ingredient, Integer> ingredientToStockLookupMap;

    public Pantry(Map<Integer, Ingredient> idToIngredientLookupMap, Map<Ingredient, Integer> ingredientToStockLookupMap) {
        this.idToIngredientLookupMap = idToIngredientLookupMap;
        this.ingredientToStockLookupMap = ingredientToStockLookupMap;
    }

    public Pantry() {
    }
}

