package cd.personal.pantry.unit;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Unit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "Name is mandatory")
    private final String name;
    private final String description;
    private final String shorthand;

    public Unit() {
        description = "";
        name = "";
        shorthand = "";
    }

    public Unit(String name, String description, String shorthand) {
        this.name = name;
        this.description = description;
        this.shorthand = shorthand;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getShorthand() {
        return shorthand;
    }
}
