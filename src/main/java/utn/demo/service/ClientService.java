package utn.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.demo.config.LoggerConfig;
import utn.demo.model.Client;
import utn.demo.repositories.ClientRepository;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public void addClient(Client c){
        clientRepository.save(c);
    }

    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    public Client getClientById(Integer id) {
        return clientRepository.findById(id).orElse(null);
    }

    public void deleteClientById(Integer id) {
        Client clientToDelete = getClientById(id);
        if (!clientToDelete.equals(null)) {
            clientRepository.delete(clientToDelete);
        } else {
            LoggerConfig.LOGGER.error("The Client doesn't exist");
        }
    }

}
