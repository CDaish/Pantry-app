package cd.personal.Pantry;

import cd.personal.Pantry.dm.Ingredient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class PantryApplication {

	public static void main(String[] args) {
		SpringApplication.run(PantryApplication.class, args);
	}

	@Bean
	CommandLineRunner init(IngredientRepository ingredientRepository) {
		return args -> {
			Stream.of("Spinat", "Möhren", "Keks", "Brezel", "Apfel").forEach(name -> {
				Ingredient ingredient = new Ingredient(name, name.toLowerCase());
				ingredientRepository.save(ingredient);
			});
			ingredientRepository.findAll().forEach(System.out::println);
		};
	}

}
