package tekup.de.jardin.Entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Data
@Entity
@Table(name = "Enfant")
public class EnfantEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_e ;
    private String nom ;
    private String prenom ;
    private LocalDate dob ;
    @Enumerated(EnumType.STRING)
    private EnfantCategorie categorie;

    @OneToOne
    private InscriptionEntity inscription;
    @ManyToOne
    @JoinColumn
    private ParentEntity parent;

    public String getNomComplet(String nom, String prenom){
        return "nom"+" "+"prenom";
    }
    public int getAge(){
        return (int) ChronoUnit.YEARS.between(dob, LocalDate.now());
    }
}
