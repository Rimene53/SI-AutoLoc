package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Client;
import tn.esprit.autoloc.repositories.ClientRepositorie;

import java.util.List;
@Service
@AllArgsConstructor
public class ClientService implements IClientService{
    ClientRepositorie clientrepo;

    @Override
    public Client addClient(Client client) {
        return clientrepo.save(client);
    }

    @Override
    public Client updateClient(Client client) {
        return clientrepo.save(client);
    }

    @Override
    public void deleteClient(Long id) {
        clientrepo.deleteById(id);
    }

    @Override
    public List<Client> afficheClient() {
        return clientrepo.findAll();
    }
}
