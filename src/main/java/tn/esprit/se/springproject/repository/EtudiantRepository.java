package tn.esprit.se.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.se.springproject.entity.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {

}