package tn.esprit.autoloc.service;

import tn.esprit.autoloc.entities.Employe;
import tn.esprit.autoloc.repositories.EmployeRepositorie;

import java.util.List;

public class EmployeService implements IEmployeService {
    EmployeRepositorie employeRepositorie;
    @Override
    public Employe addEmploye(Employe e) {
            return employeRepositorie.save(e);
    }

    @Override
    public Employe updateEmploye(Employe e) {
        return null;
    }

    @Override
    public void deleteEmploye(Employe e) {

    }

    @Override
    public List<Employe> getAllEmploye() {
        return List.of();
    }
}
