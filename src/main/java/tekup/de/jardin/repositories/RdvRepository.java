package tekup.de.jardin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tekup.de.jardin.Entities.RendezvousEntity;

public interface RdvRepository extends JpaRepository<RendezvousEntity, Integer> {
}