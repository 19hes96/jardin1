package tekup.de.jardin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tekup.de.jardin.Entities.ResponsableEntity;

@Repository
public interface ResponsableRepository extends JpaRepository<ResponsableEntity,Integer> {
}
