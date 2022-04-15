package tekup.de.jardin.repositories;

import java.util.Optional;

import org.springframework.data.rest.webmvc.RepositoryRestController;
import tekup.de.jardin.models.ERole;
import tekup.de.jardin.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

@RepositoryRestController
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
