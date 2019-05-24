package utn.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utn.demo.model.Client;
import utn.demo.service.ClientService;

import java.util.List;

@RequestMapping("/client")
@RestController
public class ClientController {

    @Autowired
    ClientService clientService;

    @PostMapping("")
    public void addClient(@RequestBody Client c) {
        clientService.addClient(c);
    }

    @GetMapping("")
    public List<Client> getAll() {
        return clientService.getAll();
    }

    @GetMapping("/{id}")
    public Client getClientById(@RequestParam Integer id) {
        return clientService.getClientById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteClientById(@RequestParam Integer id) {
        clientService.deleteClientById(id);
    }
    
}


