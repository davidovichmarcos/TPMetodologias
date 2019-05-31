package utn.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utn.demo.model.Car;
import utn.demo.service.CarService;

import javax.ws.rs.core.MediaType;
import java.util.List;

@RequestMapping("/car")
@RestController
public class CarController {

    @Autowired
    CarService carService;

    @PostMapping(value = "", produces = {MediaType.APPLICATION_JSON})
    public Car addCar(@RequestBody Car c) {
        return carService.saveCar(c);
    }

    @GetMapping(value = "", produces = {MediaType.APPLICATION_JSON})
    public List<Car> getAll() {
        return carService.getAll();
    }

    @GetMapping(value = "/{id}", produces = {MediaType.APPLICATION_JSON})
    public Car getCarById(@RequestParam Integer id) {
        return carService.getCarById(id);
    }

    @DeleteMapping(value = "/{id}", produces = {MediaType.APPLICATION_JSON})
    public void deleteCarById(@RequestParam Integer id) {
        carService.deleteCarById(id);
    }

}

