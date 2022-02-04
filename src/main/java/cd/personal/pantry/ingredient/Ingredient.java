package cd.personal.pantry.ingredient;

import cd.personal.pantry.unit.Unit;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Ingredient {

    public long getId() {
        return id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "Name is mandatory")
    private final String name;
    private String description;
    @OneToOne
    private final Unit unitOfMeasurement;
    private float amount;
    private int recipeId;

    public Ingredient(String name, String description, Unit unitOfMeasurement, float amount, int recipeId) {
        this.name = name;
        this.description = description;
        this.amount = amount;
        this.recipeId = recipeId;
        this.unitOfMeasurement = null;
    }

    public Ingredient() {
        description = null;
        name = "";
        unitOfMeasurement = null;
        amount = 0;
        recipeId = 0;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public float getAmount() {
        return amount;
    }

    public int getRecipeId() {
        return recipeId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", unitOfMeasurement=" + unitOfMeasurement +
                '}';
    }
}