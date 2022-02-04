package cd.personal.pantry.recipe;

import cd.personal.pantry.ingredient.Ingredient;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "Name is mandatory")
    private final String name;
    private final String description;
    @OneToMany
    @NotBlank(message = "Ingredients are mandatory")
    private List<Ingredient> ingredients;
    @NotBlank(message = "Instructions are mandatory")
    private final String instructions;

    public Recipe() {
        description = "";
        name = "";
        instructions = "";
    }

    public Recipe(String name, String description, List ingredients, String instructions) {
        this.name = name;
        this.description = description;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public String getInstructions() {
        return instructions;
    }
}
