package tekup.de.jardin.repositories;

import java.util.Optional;

import org.springframework.data.rest.webmvc.RepositoryRestController;
import tekup.de.jardin.Models.ERole;
import tekup.de.jardin.Models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@RepositoryRestController
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
