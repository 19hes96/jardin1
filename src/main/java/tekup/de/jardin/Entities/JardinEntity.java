package tekup.de.jardin.Entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Jardin_enfant")
@Data
public class JardinEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_j ;
    private String nom ;
    private String adresse ;
    private String region ;
    private double frais_mensuel ;
    private int reputation ;

    @OneToMany(mappedBy = "jardin")
    private List<ActiviteEntity> activites;
    @OneToMany(mappedBy = "jardin")
    private List<EmployeEntity> employes;
    @OneToMany(mappedBy = "jardin")
    private List<InscriptionEntity> inscriptions;
    @OneToMany(mappedBy = "jardin")
    private List<ResponsableEntity> responsables;
    @OneToMany(mappedBy = "jardin")
    private List<ParentEntity> parents;
}
