package tn.esprit.se.springproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.Set ;
@Entity
@Table(name = "Reservation")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation implements Serializable {
    @Id
    private String idReservation;

    @Temporal(TemporalType.DATE)
    private Date anneeUniversitaire;

    private boolean estValide;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;
}
