package tn.esprit.autoloc.service;

import tn.esprit.autoloc.entities.Client;
import tn.esprit.autoloc.entities.Employe;

import java.util.List;

public interface IEmployeService {
    Employe addEmploye(Employe e);
    Employe updateEmploye(Employe e);
    void deleteEmploye(Employe e);
    List<Employe> getAllEmploye();
}
