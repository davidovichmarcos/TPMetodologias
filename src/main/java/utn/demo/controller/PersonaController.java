package utn.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.demo.model.Persona;
import utn.demo.repositories.PersonaRepository;

import java.util.List;

@RequestMapping("/persona")
@RestController
public class PersonaController {

    @Autowired
    PersonaRepository personaRepository;

    @PostMapping("")
    public void addPersona(@RequestBody Persona p) {
        personaRepository.save(p);
    }

    @GetMapping("")
    public List<Persona> getAll(){
        return personaRepository.findAll();
    }

}
