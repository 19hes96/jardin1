package tekup.de.jardin.Services;

import tekup.de.jardin.Entities.EvenementEntity;
import tekup.de.jardin.repositories.EvenementRepository;

import java.util.List;
import java.util.Optional;

public class EvenementService {
    private EvenementRepository evenementRepository ;

    public List<EvenementEntity> listAllEmployes() {
        return evenementRepository.findAll();
    }

    public Optional<EvenementEntity> getActiviteById(int id) {
        return evenementRepository.findById(id);
    }

    public EvenementEntity saveActivite (EvenementEntity activite ) {
        return evenementRepository.save(activite);
    }

    public Iterable<EvenementEntity> deleteActivite(int id_a) {
        evenementRepository.deleteById(id_a);
        return evenementRepository.findAll();
    }
}
