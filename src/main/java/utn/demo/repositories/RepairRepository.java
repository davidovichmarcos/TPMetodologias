package utn.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utn.demo.model.Repair;

@Repository
public interface RepairRepository extends JpaRepository<Repair,Integer> {
}
