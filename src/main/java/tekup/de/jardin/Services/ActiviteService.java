package tekup.de.jardin.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tekup.de.jardin.Entities.ActiviteEntity;
import tekup.de.jardin.repositories.ActiviteRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ActiviteService {
    private ActiviteRepository activiteRepository ;

    public List<ActiviteEntity> listAllActivites() {
        return activiteRepository.findAll();
    }

    public Optional<ActiviteEntity> getActiviteById(int id) {
        return activiteRepository.findById(id);
    }

    public ActiviteEntity saveActivite (ActiviteEntity activite ) {
        return activiteRepository.save(activite);
    }

    public List<ActiviteEntity> deleteActivite(int id) {
        activiteRepository.deleteById(id);
        return activiteRepository.findAll();
    }

}
