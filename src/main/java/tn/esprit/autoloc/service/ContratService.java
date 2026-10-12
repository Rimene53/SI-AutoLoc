package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Contrat;
import tn.esprit.autoloc.repositories.ContratRepositorie;

import java.util.List;
@Service
@AllArgsConstructor

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
    public void deleteContrat(Long id) {
        contratRepo.deleteById(id);

    }

    @Override
    public List<Contrat> getAllContrat() {
        return contratRepo.findAll();
    }
}
