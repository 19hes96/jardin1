package tekup.de.jardin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tekup.de.jardin.Entities.InscriptionEntity;

@Repository
public interface InscriptionRepository extends JpaRepository<InscriptionEntity,Integer> {
}
