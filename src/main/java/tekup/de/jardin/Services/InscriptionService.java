package tekup.de.jardin.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tekup.de.jardin.Entities.EmployeEntity;
import tekup.de.jardin.Entities.InscriptionEntity;
import tekup.de.jardin.repositories.InscriptionRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class InscriptionService {
    private InscriptionRepository inscriptionRepository ;

    public List<InscriptionEntity> listAllInscriptions() {
        return inscriptionRepository.findAll();
    }

    public Optional<InscriptionEntity> getInscriptionById(int id) {
        return inscriptionRepository.findById(id);
    }

    public InscriptionEntity saveInscription (InscriptionEntity inscription) {
        return inscriptionRepository.save(inscription);
    }

    public List<InscriptionEntity> deleteInscription(int id) {
        inscriptionRepository.deleteById(id);
        return inscriptionRepository.findAll();
    }
}
