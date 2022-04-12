package tekup.de.jardin.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tekup.de.jardin.Entities.EnfantEntity;

@Repository
public interface EnfantRepository extends CrudRepository<EnfantEntity,Integer> {
}
