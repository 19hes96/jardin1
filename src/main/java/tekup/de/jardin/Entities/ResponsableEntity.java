package tekup.de.jardin.Entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Responsable")
@Data
public class ResponsableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_r ;
    private String nom ;
    private String prenom ;
    private int num_tel ;
    private String Adresse ;

    @OneToMany(mappedBy = "responsable")
    private List<OrganisationEntity> organisations;
    @OneToMany(mappedBy = "responsable")
    private List<RendezvousEntity> rdvs;
    @ManyToOne
    private JardinEntity jardin;
}

