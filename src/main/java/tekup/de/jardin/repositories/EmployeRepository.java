package tekup.de.jardin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tekup.de.jardin.Entities.EmployeEntity;

public interface EmployeRepository extends JpaRepository<EmployeEntity,Integer> {
}
