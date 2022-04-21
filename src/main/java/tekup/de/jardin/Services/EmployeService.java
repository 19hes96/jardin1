package tekup.de.jardin.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tekup.de.jardin.Entities.EmployeEntity;
import tekup.de.jardin.repositories.EmployeRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EmployeService {
    private EmployeRepository employeRepository ;

    public List<EmployeEntity> listAllEmployes() {
        return employeRepository.findAll();
    }

    public Optional<EmployeEntity> getEmployeById(int id) {
        return employeRepository.findById(id);
    }

    public EmployeEntity saveEmploye (EmployeEntity employe) {
        return employeRepository.save(employe);
    }

    public List<EmployeEntity> deleteEmploye(int id) {
        employeRepository.deleteById(id);
        return employeRepository.findAll();
    }
}
