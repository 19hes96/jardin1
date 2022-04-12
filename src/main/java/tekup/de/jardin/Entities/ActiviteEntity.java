package tekup.de.jardin.Entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Activite")
@Data
public class ActiviteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_a ;
    private String libelle ;

    @ManyToOne
    private JardinEntity jardin;
}
