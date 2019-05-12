package utn.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utn.demo.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client,Integer> {
}
