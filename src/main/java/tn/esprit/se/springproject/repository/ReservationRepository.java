package tn.esprit.se.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.se.springproject.entity.Reservation;


public interface ReservationRepository extends JpaRepository<Reservation,String> {
}
