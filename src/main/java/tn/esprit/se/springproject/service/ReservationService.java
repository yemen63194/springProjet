package tn.esprit.se.springproject.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.se.springproject.entity.Reservation;
import tn.esprit.se.springproject.repository.ReservationRepository;

import java.util.List;
@Service
@Slf4j
@AllArgsConstructor
public class ReservationService implements IReservationService{
    ReservationRepository reservationRepository;
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
}
