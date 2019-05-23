package utn.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import utn.demo.model.Car;
import utn.demo.service.CarService;

import java.util.List;
import java.util.Optional;

@RequestMapping("/car")
@RestController
public class CarController {

    @Autowired
    CarService carService;

    @PostMapping("")
    public void addCar(@RequestBody Car c) {
        carService.saveCar(c);
    }
    @GetMapping("")
    public List<Car> getAll() {
        return carService.getAll();
    }


    @GetMapping("/{id}")
    public Optional<Car> getCarById(@RequestParam Integer id) {
        return carService.getCarById(id);
    }

}

