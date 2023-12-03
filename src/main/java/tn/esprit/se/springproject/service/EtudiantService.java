package tn.esprit.se.springproject.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.se.springproject.entity.Etudiant;
import tn.esprit.se.springproject.entity.Reservation;
import tn.esprit.se.springproject.repository.EtudiantRepository;
import tn.esprit.se.springproject.repository.ReservationRepository;

import java.util.List;
@Service
@Slf4j
@AllArgsConstructor
public class EtudiantService implements IEtudiantService {
    EtudiantRepository etudiantRepository;
    ReservationRepository reservationRepository;
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
    @Override
    public Etudiant affecterEtudiantAReservation(String nomEt, String prenomEt, String idReservation) {
        Etudiant etudiant=etudiantRepository.findByNomEtAndAndPrenomEt( nomEt,prenomEt);
        Reservation reservation=reservationRepository.findById(idReservation).get();
        reservation.getEtudiants().add(etudiant); //le reservation est le pere (la liste on n'utilise pas set on utilise get &&add)
        reservationRepository.save(reservation);

        return (etudiant);
    }

}
