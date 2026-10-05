package tn.esprit.autoloc.service;

import tn.esprit.autoloc.entities.Client;

import java.util.List;

public interface IClientService {
    Client addClient(Client client);
    Client updateClient(Client client);
    void deleteClient(Client client);
    List<Client> afficheClient();
}
