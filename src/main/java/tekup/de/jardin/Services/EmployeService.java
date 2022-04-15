package tekup.de.jardin.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tekup.de.jardin.Entities.EmployeEntity;
import tekup.de.jardin.repositories.EmployeRepository;

import java.util.Optional;

@Service
@AllArgsConstructor
public class EmployeService {
    private EmployeRepository employeRepository ;

    public Iterable<EmployeEntity> listAllEmployes() {
        return employeRepository.findAll();
    }

    public Optional<EmployeEntity> getActiviteById(int id_a) {
        return employeRepository.findById(id_a);
    }

    public EmployeEntity saveActivite (EmployeEntity activite ) {
        return employeRepository.save(activite);
    }

    public Iterable<EmployeEntity> deleteActivite(int id_a) {
        employeRepository.deleteById(id_a);
        return employeRepository.findAll();
    }
}
