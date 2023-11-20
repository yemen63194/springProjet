package tn.esprit.se.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.se.springproject.entity.Universite;

public interface UniversiteRepository extends JpaRepository<Universite,Long> {
    Universite findByNomUniversite(String nomUniversite);
}
