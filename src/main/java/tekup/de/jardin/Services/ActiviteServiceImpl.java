package tekup.de.jardin.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tekup.de.jardin.Entities.ActiviteEntity;
import tekup.de.jardin.Entities.EnfantEntity;
import tekup.de.jardin.repositories.ActiviteRepository;
import tekup.de.jardin.repositories.EnfantRepository;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ActiviteServiceImpl implements ActiviteService {
    private ActiviteRepository activiteRepository ;

    @Override
    public Iterable<ActiviteEntity> listAllActivites() {
        return activiteRepository.findAll();
    }

    @Override
    public Optional<ActiviteEntity> getActiviteById(int id_a) {
        return activiteRepository.findById(id_a);
    }

    @Override
    public ActiviteEntity saveActivite (ActiviteEntity activite ) {
        return activiteRepository.save(activite);
    }

    @Override
    public Iterable<ActiviteEntity> deleteActivite(int id_a) {
        activiteRepository.deleteById(id_a);
        return activiteRepository.findAll();
    }

}
