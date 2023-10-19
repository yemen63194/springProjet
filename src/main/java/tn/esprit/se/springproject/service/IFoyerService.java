package tn.esprit.se.springproject.service;

import tn.esprit.se.springproject.entity.Foyer;

import java.util.List;

public interface IFoyerService {
    List<Foyer> retrieveAllFoyers();

    Foyer addFoyer(Foyer e);

    Foyer updateFoyer(Foyer e);

    Foyer retrieveFoyer(Long idFoyer);

    void removeFoyer(Long idFoyer);
}

