package tekup.de.jardin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tekup.de.jardin.Entities.EmployeEntity;

@Repository
public interface EmployeRepository extends JpaRepository<EmployeEntity,Integer> {
}
