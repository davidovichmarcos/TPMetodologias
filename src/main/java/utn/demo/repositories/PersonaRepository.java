package utn.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utn.demo.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository <Persona,Integer> {

}
