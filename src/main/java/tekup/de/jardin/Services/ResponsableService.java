package tekup.de.jardin.Services;

import tekup.de.jardin.Entities.ParentEntity;
import tekup.de.jardin.Entities.ResponsableEntity;
import tekup.de.jardin.repositories.ParentRepository;
import tekup.de.jardin.repositories.ResponsableRepository;

import java.util.List;
import java.util.Optional;

public class ResponsableService {
    private ResponsableRepository responsableRepository ;

    public List<ResponsableEntity> listAllResponsables() {
        return responsableRepository.findAll();
    }

    public Optional<ResponsableEntity> getParentById(int id) {
        return responsableRepository.findById(id);
    }

    public ResponsableEntity saveParent (ResponsableEntity parent) {
        return responsableRepository.save(parent);
    }

    public List<ResponsableEntity> deleteParent(int id) {
        responsableRepository.deleteById(id);
        return responsableRepository.findAll();
    }
}
