package tekup.de.jardin.repositories;

import org.springframework.data.repository.CrudRepository;
import tekup.de.jardin.Entities.InscriptionEntity;

public interface InscriptionRepository extends CrudRepository<InscriptionEntity,Integer> {
}
