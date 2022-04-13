package tekup.de.jardin.repositories;

import org.springframework.data.repository.CrudRepository;
import tekup.de.jardin.Entities.ParentEntity;

public interface ParentRepository extends JpaRepository<ParentEntity,Integer> {
}
