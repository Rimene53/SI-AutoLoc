package tn.esprit.autoloc.service;

import tn.esprit.autoloc.entities.Maintenance;

import java.util.List;

public interface IMaintenanceService {
    Maintenance updateMaintenance(Maintenance e);
    void deleteMaintenance(Long id);
    List<Maintenance> getAllMaintenance();
    Maintenance createMaintenance(Maintenance e);
}
