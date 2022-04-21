package tekup.de.jardin.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tekup.de.jardin.Entities.OrganisationEntity;
import tekup.de.jardin.Entities.ParentEntity;
import tekup.de.jardin.repositories.OrganisationRepository;
import tekup.de.jardin.repositories.ParentRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ParentService {
    private ParentRepository parentRepository ;

    public List<ParentEntity> listAllParents() {
        return parentRepository.findAll();
    }

    public Optional<ParentEntity> getParentById(int id) {
        return parentRepository.findById(id);
    }

    public ParentEntity saveParent (ParentEntity parent) {
        return parentRepository.save(parent);
    }

    public List<ParentEntity> deleteParent(int id) {
        parentRepository.deleteById(id);
        return parentRepository.findAll();
    }
}
