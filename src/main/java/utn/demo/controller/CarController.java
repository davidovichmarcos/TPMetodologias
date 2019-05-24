package utn.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utn.demo.model.Car;
import utn.demo.service.CarService;

import java.util.List;

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
    public Car getCarById(@RequestParam Integer id) {
        return carService.getCarById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCarById(@RequestParam Integer id) {
        carService.deleteCarById(id);
    }

}

