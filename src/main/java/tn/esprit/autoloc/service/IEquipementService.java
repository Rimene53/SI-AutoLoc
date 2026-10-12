package tn.esprit.autoloc.service;

import tn.esprit.autoloc.entities.Equipement;

import java.util.List;

public interface IEquipementService {
    Equipement createEquipement(Equipement e);
    void deleteEquipement(Long id);
    List<Equipement> getAllEquipement();
    Equipement updateEquipement(Equipement e);
}
