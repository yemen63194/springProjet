package tn.esprit.se.springproject.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.se.springproject.entity.Chambre;
import tn.esprit.se.springproject.repository.ChambreRepository;

import java.util.List;
@Service
@Slf4j
@AllArgsConstructor
public class ChambreService implements IChambreService{
    ChambreRepository chambreRepository;
    @Override
    public List<Chambre> retrieveAllEtudiants() { return chambreRepository.findAll(); }

    @Override
    public Chambre addchambre(Chambre c) {
      return  chambreRepository.save(c) ;
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return  chambreRepository.save(c) ;
    }

    @Override
    public Chambre retrieveChambre(Long idChambre) {
        return chambreRepository.findById(idChambre).orElse(null) ;
    }

    @Override
    public void removechambre(Long idChambre) {
        chambreRepository.deleteById(idChambre);
    }
}
