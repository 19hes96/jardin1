package tekup.de.jardin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tekup.de.jardin.Entities.InscriptionEntity;

public interface InscriptionRepository extends JpaRepository<InscriptionEntity,Integer> {
}
