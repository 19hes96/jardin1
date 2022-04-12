package tekup.de.jardin.Entities;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "Organistion")
@Data
public class OrganisationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_o;

    @ManyToOne
    @JoinColumn
    private ResponsableEntity responsable;
    @ManyToOne
    @JoinColumn
    private EvenementEntity evenement;
}
