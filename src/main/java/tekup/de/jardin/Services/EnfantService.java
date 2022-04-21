package tekup.de.jardin.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tekup.de.jardin.Entities.EnfantEntity;
import tekup.de.jardin.repositories.EnfantRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EnfantService {
    private EnfantRepository enfantRepository ;

    public List<EnfantEntity> listAllEnfants() {
        return enfantRepository.findAll();
    }

    public Optional<EnfantEntity> getEnfantById(int id_e) {
        return enfantRepository.findById(id_e);
    }

    public EnfantEntity saveEnfant (EnfantEntity enfant ) {
        return enfantRepository.save(enfant);
    }

    public List<EnfantEntity> deleteEnfant(int id_e) {
         enfantRepository.deleteById(id_e);
        return enfantRepository.findAll();
    }
}
