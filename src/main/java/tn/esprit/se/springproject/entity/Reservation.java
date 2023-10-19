package tn.esprit.se.springproject.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set ;
@Entity
@Table(name = "Reservation")
public class Reservation implements Serializable {
    @Id
    private String idReservation;

    @Temporal(TemporalType.DATE)
    private Date anneeUniversitaire;

    private boolean estValide;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;
}
