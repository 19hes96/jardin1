package tekup.de.jardin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tekup.de.jardin.Entities.ResponsableEntity;

public interface ResponsableRepository extends JpaRepository<ResponsableEntity,Integer> {
}
