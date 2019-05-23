package utn.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.demo.model.Car;
import utn.demo.repositories.CarRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {


    @Autowired
    CarRepository carRepository;

    public void saveCar(Car c ){
        carRepository.save(c);
    }

    public List<Car> getAll(){
        return carRepository.findAll();
    }

    public Optional<Car> getCarById(Integer id) {
        return carRepository.findById(id);
    }
}
