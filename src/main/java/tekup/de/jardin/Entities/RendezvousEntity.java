package tekup.de.jardin.Entities;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "rdv")
@Data
public class RendezvousEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRdv;
    private LocalDate date ;
    private String sujet ;

    @ManyToOne
    @JoinColumn
    private ResponsableEntity responsable;
    @ManyToOne
    @JoinColumn
    private ParentEntity parent;
}
