package tn.esprit.se.springproject.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.se.springproject.entity.Universite;
import tn.esprit.se.springproject.repository.FoyerRepository;
import tn.esprit.se.springproject.repository.UniversiteRepository;
import tn.esprit.se.springproject.entity.Foyer;
import java.util.List;
@Service
@Slf4j
@AllArgsConstructor
public class UniversiteService implements IUniversiteService {
     UniversiteRepository universiteRepository;
     FoyerRepository foyerRepository;
    @Override
    public List<Universite> retrieveAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite retrieveUniversite(Long idUniversite) {
        return universiteRepository.findById(idUniversite).orElse(null);
    }

    @Override
    public void removeUniversite(Long idUniversite) {
        universiteRepository.deleteById(idUniversite);
    }

    @Override
    public Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite) {
        Foyer foyer=foyerRepository.findById( idFoyer).get();
        Universite universite=universiteRepository.findByNomUniversite(nomUniversite);
        universite.setFoyer(foyer);
        universiteRepository.save(universite);
        return universite;

    }

    @Override
    public Universite desaffecterFoyerAUniversite(long idUniversite) {

        Universite universite=universiteRepository.findById(idUniversite).get();
        universite.setFoyer(null);
        universiteRepository.save(universite);
        return universite;
    }

}