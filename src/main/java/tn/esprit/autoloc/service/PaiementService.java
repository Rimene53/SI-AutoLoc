package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Paiement;
import tn.esprit.autoloc.repositories.PaiementRepositorie;

import java.util.List;
@Service
@AllArgsConstructor

public class PaiementService implements IPaiementService {
    PaiementRepositorie paiementrepo;
    @Override
    public Paiement createPaiement(Paiement p) {
        return paiementrepo.save(p);
    }

    @Override
    public void deletePaiement(Long id) {
        paiementrepo.deleteById(id);
    }

    @Override
    public List<Paiement> getAllPaiement() {
        return paiementrepo.findAll();
    }

    @Override
    public Paiement updatePaiement(Paiement p) {
        return paiementrepo.save(p);
    }
}
