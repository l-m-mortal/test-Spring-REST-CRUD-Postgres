package com.example.testspringrestcrudpostgres.Controller;

import com.example.testspringrestcrudpostgres.Entities.CarEntity;
import com.example.testspringrestcrudpostgres.Services.ICarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/car")
public class CarController {

    private final ICarService carService;

    public CarController(ICarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<CarEntity> findAllCars() {
        return carService.findAllCars();
    }

    @GetMapping("/{id}")
    public Optional<CarEntity> findCarById(@PathVariable("id") Long id) {
        return carService.findByID(id);
    }

    @PostMapping
    public CarEntity saveCar(@RequestBody CarEntity carEntity) {
        return carService.saveCar(carEntity);
    }

    @PutMapping
    public CarEntity updateCar(@RequestBody CarEntity carEntity) {
        return carService.updateCar(carEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable("id") Long id){
        carService.deleteCar(id);
    }
}
