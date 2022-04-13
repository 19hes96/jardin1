package tekup.de.jardin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tekup.de.jardin.Entities.NotificationEntity;

public interface NotifRepository extends JpaRepository<NotificationEntity, Integer> {
}
