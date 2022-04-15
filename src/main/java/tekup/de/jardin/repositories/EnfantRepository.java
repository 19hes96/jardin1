package tekup.de.jardin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tekup.de.jardin.Entities.EnfantEntity;

@Repository
public interface EnfantRepository extends JpaRepository<EnfantEntity,Integer> {
}
