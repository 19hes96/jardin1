package tekup.de.jardin.Services;

import tekup.de.jardin.Entities.ActiviteEntity;
import tekup.de.jardin.Entities.EnfantEntity;

import java.util.Optional;

public interface ActiviteService {
    Iterable<ActiviteEntity> listAllActivites();

    public Optional<ActiviteEntity> getActiviteById(int id_a);

    public ActiviteEntity saveActivite(ActiviteEntity activite);

    public Iterable<ActiviteEntity> deleteActivite(int id_a);
}
