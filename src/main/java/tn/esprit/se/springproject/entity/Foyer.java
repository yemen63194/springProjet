package tn.esprit.se.springproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;
@Entity
@Table(name = "Foyer")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;

    private String nomFoyer;
    private Long capaciteFoyer;
    @OneToOne(mappedBy="foyer")
    private Universite universite;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="foyer",fetch = FetchType.EAGER)
    private Set<Bloc> Blocs;
}
