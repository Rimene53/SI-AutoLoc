package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Vehicule;
import tn.esprit.autoloc.repositories.VehiculeRepositorie;

import java.util.List;
@Service
@AllArgsConstructor
public class VehiculeService implements IVehiculeService {
    VehiculeRepositorie vehiculeRepositorie;
    @Override
    public Vehicule createVehicule(Vehicule vehicule) {
        return  vehiculeRepositorie.save(vehicule);
    }

    @Override
    public Vehicule updateVehicule(Vehicule vehicule) {
        return vehiculeRepositorie.save(vehicule);
    }

    @Override
    public void deleteVehicule(Long id) {
        vehiculeRepositorie.deleteById(id);

    }

    @Override
    public List<Vehicule> getAllVehicule() {
        return vehiculeRepositorie.findAll();
    }
}
