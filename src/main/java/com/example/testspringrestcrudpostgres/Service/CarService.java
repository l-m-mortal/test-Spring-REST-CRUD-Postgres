package com.example.testspringrestcrudpostgres.Service;

import com.example.testspringrestcrudpostgres.Entity.CarEntity;

import java.util.List;
import java.util.Optional;

public interface CarService {
    List<CarEntity> findAllCars();
    Optional<CarEntity> findByID(Long id);
    CarEntity saveCar(CarEntity carEntity);
    CarEntity updateCar(CarEntity carEntity);
    void deleteCar(Long id);
}
