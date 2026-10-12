package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Employe;
import tn.esprit.autoloc.repositories.EmployeRepositorie;

import java.util.List;
@Service
@AllArgsConstructor
public class EmployeService implements IEmployeService {
    EmployeRepositorie employeRepositorie;
    @Override
    public Employe addEmploye(Employe e) {
            return employeRepositorie.save(e);
    }

    @Override
    public Employe updateEmploye(Employe e) {
        return employeRepositorie.save(e);
    }

    @Override
    public void deleteEmploye(Long id) {
        employeRepositorie.deleteById(id);
    }

    @Override
    public List<Employe> getAllEmploye() {
        return employeRepositorie.findAll();
    }
}
