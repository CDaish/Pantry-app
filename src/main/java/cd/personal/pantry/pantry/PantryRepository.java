package cd.personal.pantry.pantry;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface PantryRepository extends CrudRepository<Pantry, Long> {

}
