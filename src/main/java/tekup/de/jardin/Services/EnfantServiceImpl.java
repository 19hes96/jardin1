package tekup.de.jardin.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tekup.de.jardin.Entities.EnfantEntity;
import tekup.de.jardin.repositories.EnfantRepository;

import java.util.Optional;

@Service
@AllArgsConstructor
public class EnfantServiceImpl implements EnfantService {
    private EnfantRepository enfantRepository ;

    @Override
    public Iterable<EnfantEntity> listAllEnfants() {
        return enfantRepository.findAll();
    }

    @Override
    public Optional<EnfantEntity> getEnfantById(int id_e) {
        return enfantRepository.findById(id_e);
    }

    @Override
    public EnfantEntity saveEnfant (EnfantEntity enfant ) {
        return enfantRepository.save(enfant);
    }

    @Override
    public Iterable<EnfantEntity> deleteEnfant(int id_e) {
         enfantRepository.deleteById(id_e);
        return enfantRepository.findAll();
    }

}
