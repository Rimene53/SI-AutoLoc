package tn.esprit.autoloc.service;

import tn.esprit.autoloc.entities.Paiement;

import java.util.List;

public interface IPaiementService {
    Paiement createPaiement(Paiement p);
    void deletePaiement(Paiement p);
    List<Paiement> getAllPaiement();
    Paiement updatePaiement(Paiement p);
}
