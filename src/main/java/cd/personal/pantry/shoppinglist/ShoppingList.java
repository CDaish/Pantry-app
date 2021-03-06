package cd.personal.pantry.shoppinglist;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class ShoppingList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "Name is mandatory")
    private final String name;
    private final String description;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ShoppingList() {
        description = "";
        name = "";
    }

    public ShoppingList(String name, String description) {
        this.name = name;
        this.description = description;
    }


}
