package tn.esprit.se.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.se.springproject.entity.Reservation;

import java.util.Date;
import java.util.List;


public interface ReservationRepository extends JpaRepository<Reservation,String> {
    List<Reservation> findByAnneeUniversitaireBetween(Date dateDebut , Date dateFin );
}
