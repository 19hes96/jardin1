package tekup.de.jardin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tekup.de.jardin.Entities.NotifEntity;

@Repository
public interface NotifRepository extends JpaRepository<NotifEntity, Integer> {
}
