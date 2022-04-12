package tekup.de.jardin.Services;

import tekup.de.jardin.Entities.EnfantEntity;

import java.util.Optional;

public interface EnfantService {
    Iterable<EnfantEntity> listAllEnfants();

    public Optional<EnfantEntity> getEnfantById(int id_e);

    public EnfantEntity saveEnfant(EnfantEntity enfant);

    public Iterable<EnfantEntity> deleteEnfant(int id_e);
}
