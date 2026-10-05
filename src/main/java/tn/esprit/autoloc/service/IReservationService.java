package tn.esprit.autoloc.service;

import tn.esprit.autoloc.entities.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation createReservation(Reservation reservation);
    List<Reservation> getAllReservation();
    Reservation updateReservation(Reservation reservation);
    void deleteReservation(Reservation reservation);
}
