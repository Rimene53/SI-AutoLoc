package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Maintenance;
import tn.esprit.autoloc.repositories.MaintenanceRepositorie;

import java.util.List;
@Service
@AllArgsConstructor

public class MaintenanaceService implements IMaintenanceService {
    MaintenanceRepositorie maintenance;
    @Override
    public Maintenance updateMaintenance(Maintenance e) {
        return maintenance.save(e);
    }

    @Override
    public void deleteMaintenance(Long id) {
        maintenance.deleteById(id);

    }

    @Override
    public List<Maintenance> getAllMaintenance() {
        return maintenance.findAll();
    }

    @Override
    public Maintenance createMaintenance(Maintenance e) {
        return maintenance.save(e);
    }
}
