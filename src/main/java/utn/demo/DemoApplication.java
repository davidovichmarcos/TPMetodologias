package utn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import utn.demo.model.Client;
import utn.demo.repositories.ClientRepository;

@Configuration
@EnableSwagger2
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);


		Client client;

		ClientRepository clientRepository;


	}

}
