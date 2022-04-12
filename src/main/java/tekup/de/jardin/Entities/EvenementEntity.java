package tekup.de.jardin.Entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Evenement")
@Data
public class EvenementEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_ev;
    private String libellé;

    @OneToMany(mappedBy = "evenement")
    private List<OrganisationEntity> organisations;
    @OneToMany(mappedBy = "evenement")
    private List<NotificationEntity> notifications;
    @OneToMany(mappedBy = "evenement")
    private List<FeedbackEntity> feedbacks;

}
