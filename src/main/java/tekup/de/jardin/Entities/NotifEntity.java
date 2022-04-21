package tekup.de.jardin.Entities;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "notification")
@Data
public class NotifEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idn;

    @ManyToOne
    @JoinColumn
    private EvenementEntity evenement;
    @ManyToOne
    @JoinColumn
    private ParentEntity parent;
}
