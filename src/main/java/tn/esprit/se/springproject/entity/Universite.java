package tn.esprit.se.springproject.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Universite")
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversite;

    private String nomUniversite;
    private String adresse;
    @OneToOne
    private Foyer foyer ;
}
