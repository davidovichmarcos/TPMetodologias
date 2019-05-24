package utn.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.demo.config.LoggerConfig;
import utn.demo.model.Car;
import utn.demo.repositories.CarRepository;

import java.util.List;

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

    public Car getCarById(Integer id) {
        return carRepository.findById(id).orElse(null);
    }

    public void deleteCarById(Integer id) {
        Car carToDelete = getCarById(id);
        if (!carToDelete.equals(null)) {
            carRepository.delete(carToDelete);
        } else {
            LoggerConfig.LOGGER.error("The Car doesn't exist");
        }
    }

}
