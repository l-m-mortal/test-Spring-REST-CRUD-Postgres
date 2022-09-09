package com.example.testspringrestcrudpostgres.Services;

import com.example.testspringrestcrudpostgres.Entities.CarEntity;
import com.example.testspringrestcrudpostgres.Repository.ICarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService implements ICarService {

    private final ICarRepository carRepository;

    public CarService(ICarRepository carRepository) {
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
