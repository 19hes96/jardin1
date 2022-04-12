package tekup.de.jardin.Entities;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "feedback")
@Data
public class FeedbackEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_f;

    @ManyToOne
    @JoinColumn
    private EvenementEntity evenement;
    @ManyToOne
    @JoinColumn
    private ParentEntity parent;
}
