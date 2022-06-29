package com.example.testspringrestcrudpostgres.Repository;

import com.example.testspringrestcrudpostgres.Entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<CarEntity, Long> {

}
