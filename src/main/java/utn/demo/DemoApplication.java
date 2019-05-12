package utn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import utn.demo.model.Persona;
import utn.demo.repositories.PersonaRepository;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);


		Persona perosona;

		PersonaRepository personaRepository;


	}

}
