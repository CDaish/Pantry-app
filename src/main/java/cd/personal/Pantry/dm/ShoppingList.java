package cd.personal.Pantry.dm;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ShoppingList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
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
