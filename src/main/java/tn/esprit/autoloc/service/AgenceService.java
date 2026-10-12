package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Agence;
import tn.esprit.autoloc.repositories.AgenceRepositorie;

import java.util.List;
@Service
@AllArgsConstructor
public class AgenceService implements IAgenceService {
    AgenceRepositorie agencerepo;
    @Override
    public Agence addagence(Agence ag) {
        return agencerepo.save(ag);
    }

    @Override
    public void deleteagence(Long id) {
        agencerepo.deleteById(id);

    }

    @Override
    public List<Agence> afficheagence() {
        return agencerepo.findAll();
    }

    @Override
    public Agence updateagence(Agence ag) {
        return agencerepo.save(ag);
    }
}
