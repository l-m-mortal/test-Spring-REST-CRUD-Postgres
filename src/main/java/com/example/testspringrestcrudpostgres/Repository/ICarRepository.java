package com.example.testspringrestcrudpostgres.Repository;

import com.example.testspringrestcrudpostgres.Entities.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICarRepository extends JpaRepository<CarEntity, Long> {



}
