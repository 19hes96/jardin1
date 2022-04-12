package tekup.de.jardin.Entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Employé")
@Data
public class EmployeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEm ;
    private String nom ;
    private String prenom ;
    private int num_tel ;

    @ManyToOne
    private JardinEntity jardin;
}