package utn.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.demo.model.Client;
import utn.demo.repositories.ClientRepository;

import java.util.List;

@RequestMapping("/client")
@RestController
public class ClientController {

    @Autowired
    ClientRepository clientRepository;

    @PostMapping("")
    public void addClient(@RequestBody Client c) {
        clientRepository.save(c);
    }

    @GetMapping("")
    public List<Client> getAll(){
        return clientRepository.findAll();
    }

}

