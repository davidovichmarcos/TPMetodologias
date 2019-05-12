package utn.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.demo.model.Car;
import utn.demo.repositories.CarRepository;

import java.util.List;

@RequestMapping("/car")
@RestController
public class CarController {

    @Autowired
    CarRepository carRepository;

    @PostMapping("")
    public void addCar(@RequestBody Car c) {
        carRepository.save(c);
    }

    @GetMapping("")
    public List<Car> getAll(){
        return carRepository.findAll();
    }

}

