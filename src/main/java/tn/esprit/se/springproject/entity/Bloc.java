package tn.esprit.se.springproject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Bloc")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Bloc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBloc")
    private Long idBloc; // Clé primaire

    private String nomBloc;
    private Long capaciteBloc;
    @ManyToOne
    Foyer foyer;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="bloc",fetch = FetchType.EAGER)
    @JsonIgnore
    private Set<Chambre> chambres;
}