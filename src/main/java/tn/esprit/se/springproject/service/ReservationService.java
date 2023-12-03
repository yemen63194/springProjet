package tn.esprit.se.springproject.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.se.springproject.entity.Reservation;
import tn.esprit.se.springproject.repository.ChambreRepository;
import tn.esprit.se.springproject.repository.ReservationRepository;

import java.util.Date;
import java.util.List;
@Service
@Slf4j
@AllArgsConstructor
public class ReservationService implements IReservationService{
    ReservationRepository reservationRepository;
    ChambreRepository chambreRepository;
    @Override
    public List<Reservation> retrieveAllReservations() {
        return reservationRepository.findAll() ;
    }

    @Override
    public Reservation addReservation(Reservation r) {
        return null;
    }

    @Override
    public Reservation updateReservation(Reservation r) {
        return null;
    }

    @Override
    public Reservation retrieveReservation(String idReservation) {
        return null;
    }

    @Override
    public void removeReservation(String idReservation) {

    }
    public List<Reservation> getReservationParAnneeUniversitaire(Date dateDebut , Date dateFin ){
        List<Reservation> reservation=reservationRepository.findByAnneeUniversitaireBetween(dateDebut , dateFin );

        return reservation;

    }
   // @Scheduled(cron = "0 */5 * * * *")  // Run every 5 minutes
  //  public void nbPlacesDisponibleParChambreAnneeEnCours() {
  //      log.info("Calculating the number of available places for each room for the current year...");

   //     Date currentDate = new Date();
 //   SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
//
      //  List<Chambre> chambres = chambreRepository.findAll();// Retrieve all rooms, adjust this according to your actual retrieval logic

     //   for (Chambre chambre : chambres) {
      //      int nbPlacesOccupied = // Retrieve the number of occupied places for the current year and the current room
      //      int nbTotalPlaces = // Set the total number of places for the current room

      //      int nbPlacesDisponible = nbTotalPlaces - nbPlacesOccupied;

       //     log.info("- tn.esprit.foyer.services.ReservationServicImpl -");
       //     log.info("nb places restantes en {} pour la chambre {} est égale à {}", sdf.format(currentDate), chambre.getNumeroChambre(), nbPlacesDisponible);
      //  }

      //  log.info("End calculating the number of available places for each room for the current year.");
   // }
}
