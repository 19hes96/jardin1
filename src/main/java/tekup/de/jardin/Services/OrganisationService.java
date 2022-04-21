package tekup.de.jardin.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tekup.de.jardin.Entities.NotifEntity;
import tekup.de.jardin.Entities.OrganisationEntity;
import tekup.de.jardin.repositories.NotifRepository;
import tekup.de.jardin.repositories.OrganisationRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class OrganisationService {
    private OrganisationRepository organisationRepository ;

    public List<OrganisationEntity> listAllOrganisations() {
        return organisationRepository.findAll();
    }

    public Optional<OrganisationEntity> getOrganisationById(int id) {
        return organisationRepository.findById(id);
    }

    public OrganisationEntity saveNotification (OrganisationEntity organisation) {
        return organisationRepository.save(organisation);
    }

    public List<OrganisationEntity> deleteOrganisation(int id) {
        organisationRepository.deleteById(id);
        return organisationRepository.findAll();
    }
}
