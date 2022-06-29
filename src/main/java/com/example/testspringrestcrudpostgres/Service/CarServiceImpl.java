package com.example.testspringrestcrudpostgres.Service;

import com.example.testspringrestcrudpostgres.Entity.CarEntity;
import com.example.testspringrestcrudpostgres.Repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<CarEntity> findAllCars() {
        return carRepository.findAll();
    }

    @Override
    public Optional<CarEntity> findByID(Long id) {
        return carRepository.findById(id);
    }

    @Override
    public CarEntity saveCar(CarEntity carEntity) {
        return carRepository.save(carEntity);
    }

    @Override
    public CarEntity updateCar(CarEntity carEntity) {
        return carRepository.save(carEntity);
    }

    @Override
    public void deleteCar(Long id) {
    carRepository.deleteById(id);
    }
}
