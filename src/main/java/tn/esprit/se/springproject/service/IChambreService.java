package tn.esprit.se.springproject.service;



import tn.esprit.se.springproject.entity.Chambre;

import java.util.List;

public interface IChambreService {
    List<Chambre> retrieveAllEtudiants();

    Chambre addchambre(Chambre c);

    Chambre updateChambre(Chambre c);

    Chambre retrieveChambre(Long idChambre);

    void removechambre(Long idChambre);
}
