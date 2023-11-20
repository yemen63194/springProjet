package tn.esprit.se.springproject.service;

import tn.esprit.se.springproject.entity.Universite;

import java.util.List;

public interface IUniversiteService {
    List<Universite> retrieveAllUniversites();

    Universite addUniversite(Universite u);

    Universite updateUniversite(Universite e);

    Universite retrieveUniversite(Long idUniversite);

    void removeUniversite(Long idUniversite);
    public Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite) ;
    public Universite desaffecterFoyerAUniversite (long idUniversite) ;
}
