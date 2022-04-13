package tekup.de.jardin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tekup.de.jardin.Entities.JardinEntity;

public interface JardinRepository extends JpaRepository<JardinEntity, Integer> {
}
