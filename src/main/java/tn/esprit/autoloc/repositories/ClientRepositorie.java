package tn.esprit.autoloc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.entities.Client;

public interface ClientRepositorie extends JpaRepository<Client, Integer> {
    void deleteById(Long id);
}
