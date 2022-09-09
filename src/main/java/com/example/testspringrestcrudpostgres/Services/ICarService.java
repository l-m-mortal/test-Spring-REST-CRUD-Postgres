package com.example.testspringrestcrudpostgres.Services;

import com.example.testspringrestcrudpostgres.Entities.CarEntity;

import java.util.List;
import java.util.Optional;

public interface ICarService {
    List<CarEntity> findAllCars();
    Optional<CarEntity> findByID(Long id);
    CarEntity saveCar(CarEntity carEntity);
    CarEntity updateCar(CarEntity carEntity);
    void deleteCar(Long id);

}
