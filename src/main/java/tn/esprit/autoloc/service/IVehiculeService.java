package tn.esprit.autoloc.service;

import tn.esprit.autoloc.entities.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule createVehicule(Vehicule vehicule);
    Vehicule updateVehicule(Vehicule vehicule);
    void deleteVehicule(Long id);
    List<Vehicule> getAllVehicule();
}
