package tekup.de.jardin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tekup.de.jardin.Entities.EvenementEntity;

public interface EvenementRepository extends JpaRepository<EvenementEntity,Integer> {
}
