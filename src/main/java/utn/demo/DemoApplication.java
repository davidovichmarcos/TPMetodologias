package utn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import utn.demo.model.Persona;
import utn.demo.repositories.PersonaRepository;
@Configuration
@EnableSwagger2
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);


		Persona perosona;

		PersonaRepository personaRepository;


	}

}
