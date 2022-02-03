package cd.personal.Pantry.core;

import cd.personal.Pantry.dm.ShoppingList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingListRepository extends CrudRepository<ShoppingList, Long> {
}
