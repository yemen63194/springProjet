package tn.esprit.se.springproject.service;

import tn.esprit.se.springproject.entity.Etudiant;
import tn.esprit.se.springproject.repository.EtudiantRepository;

import java.util.List;

public class EtudiantService implements IEtudiantService {
    EtudiantRepository etudiantRepository;
    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant) {
        return etudiantRepository.findById(idEtudiant).get();
    }

    @Override
    public void removeEtudiant(Long idEtudiant) {
         etudiantRepository.deleteById(idEtudiant);
    }
}
