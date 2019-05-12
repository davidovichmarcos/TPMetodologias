package utn.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utn.demo.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car,Integer> {
}
