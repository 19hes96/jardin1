package tekup.de.jardin.Entities;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table
@Data
public class InscriptionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idi;

    @OneToOne(mappedBy = "inscription")
    private EnfantEntity enfant;
    @ManyToOne
    private JardinEntity jardin;
}
