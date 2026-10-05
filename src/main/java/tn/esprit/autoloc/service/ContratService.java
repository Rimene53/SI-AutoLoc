package tn.esprit.autoloc.service;

import tn.esprit.autoloc.entities.Contrat;
import tn.esprit.autoloc.repositories.ContratRepositorie;

import java.util.List;

public class ContratService implements IContratService {
    ContratRepositorie contratRepo;
    @Override
    public Contrat addContrat(Contrat c) {
        return contratRepo.save(c);
    }

    @Override
    public Contrat updateContrat(Contrat c) {
        return contratRepo.save(c);
    }

    @Override
    public void deleteContrat(Contrat c) {
        contratRepo.delete(c);

    }

    @Override
    public List<Contrat> getAllContrat() {
        return contratRepo.findAll();
    }
}
