package tekup.de.jardin.Services;

import tekup.de.jardin.Entities.EvenementEntity;
import tekup.de.jardin.repositories.EvenementRepository;

import java.util.Optional;

public class FeedbackService {
    private EvenementRepository evenementRepository ;

    public Iterable<EvenementEntity> listAllEmployes() {
        return evenementRepository.findAll();
    }

    public Optional<EvenementEntity> getActiviteById(int id_a) {
        return evenementRepository.findById(id_a);
    }

    public EvenementEntity saveActivite (EvenementEntity activite ) {
        return evenementRepository.save(activite);
    }

    public Iterable<EvenementEntity> deleteActivite(int id_a) {
        evenementRepository.deleteById(id_a);
        return evenementRepository.findAll();
    }
}
