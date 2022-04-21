package tekup.de.jardin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tekup.de.jardin.Entities.RendezvousEntity;

@Repository
public interface RdvRepository extends JpaRepository<RendezvousEntity, Integer> {
}