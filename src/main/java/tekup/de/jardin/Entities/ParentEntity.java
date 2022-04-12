package tekup.de.jardin.Entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Parent")
@Data
public class ParentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_p ;
    private String nom ;
    private String prenom ;
    private int num_tel ;
    private String email ;
    private String adresse ;

    @OneToMany(mappedBy = "parent")
    private List<EnfantEntity> enfants;
    @OneToMany(mappedBy = "parent")
    private List<NotificationEntity> notifications;
    @OneToMany(mappedBy = "parent")
    private List<RendezvousEntity> rdvs;
    @ManyToOne
    private JardinEntity jardin;
    @OneToMany(mappedBy = "parent")
    private List<RendezvousEntity> feedbacks;
}
