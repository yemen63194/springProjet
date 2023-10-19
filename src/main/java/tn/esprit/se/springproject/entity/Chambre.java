package tn.esprit.se.springproject.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Set;
@Entity
@Table(name = "Chambre")
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;

    private Long numeroChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;

    public enum TypeChambre {
        SIMPLE,
        DOUBLE,
        TRIPLE

    }
    @ManyToOne
    Bloc bloc ;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reservation> Reservations;
}
