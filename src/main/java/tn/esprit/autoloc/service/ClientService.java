package tn.esprit.autoloc.service;

import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Client;
import tn.esprit.autoloc.repositories.ClientRepositorie;

import java.util.List;
@Service

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
    public void deleteClient(Client client) {
        clientrepo.delete(client);
    }

    @Override
    public List<Client> afficheClient() {
        return clientrepo.findAll();
    }
}
