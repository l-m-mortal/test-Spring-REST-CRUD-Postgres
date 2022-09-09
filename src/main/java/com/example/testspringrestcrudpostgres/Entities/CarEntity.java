package com.example.testspringrestcrudpostgres.Entities;

import javax.persistence.*;

@Entity
@Table(name= "car")
public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private long id;
    @Column(name = "model")
    private String model;
    @Column(name = "max_speed")
    private int maxSpeed;
    @Column(name = "mileage")
    private int mileage;

    public CarEntity() {
    }

    public CarEntity(long id, String model, int maxSpeed, int mileage) {
        this.id = id;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.mileage = mileage;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }


}
