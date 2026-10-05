package tn.esprit.autoloc.service;

import tn.esprit.autoloc.entities.Contrat;

import java.util.List;

public interface IContratService {
  Contrat addContrat(Contrat c);
  Contrat updateContrat(Contrat c);
  void deleteContrat(Contrat c);
  List<Contrat> getAllContrat();
}
