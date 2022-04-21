package tekup.de.jardin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tekup.de.jardin.Entities.EvenementEntity;

@Repository
public interface EvenementRepository extends JpaRepository<EvenementEntity,Integer> {
}
