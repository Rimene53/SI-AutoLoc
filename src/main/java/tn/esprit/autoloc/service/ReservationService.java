package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Reservation;
import tn.esprit.autoloc.repositories.ReservationRepositorie;

import java.util.List;
@Service
@AllArgsConstructor

public class ReservationService implements IReservationService {
    ReservationRepositorie reservationrepo;
    @Override
    public Reservation createReservation(Reservation reservation) {
        return reservationrepo.save(reservation);
    }

    @Override
    public List<Reservation> getAllReservation() {
        return reservationrepo.findAll();
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationrepo.save(reservation);
    }

    @Override
    public void deleteReservation(Long id) {
        reservationrepo.deleteById(id);
    }
}
