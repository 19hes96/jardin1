package tekup.de.jardin.repositories;

import java.util.Optional;

import tekup.de.jardin.Models.ERole;
import tekup.de.jardin.Models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
