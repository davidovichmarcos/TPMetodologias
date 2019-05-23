package utn.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import utn.demo.model.Client;
import utn.demo.repositories.ClientRepository;

import java.util.List;
import java.util.Optional;

public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public void addClient(Client c){
        clientRepository.save(c);
    }

    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    public Optional<Client> getClientById(Integer id) {
        return clientRepository.findById(id);
    }
}
