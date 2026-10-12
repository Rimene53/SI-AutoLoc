package tn.esprit.autoloc.service;

import tn.esprit.autoloc.entities.Agence;

import java.util.List;

public interface IAgenceService {
    Agence addagence(Agence ag);
    void deleteagence(Long id);
    List<Agence> afficheagence();
    Agence updateagence(Agence ag);

}
