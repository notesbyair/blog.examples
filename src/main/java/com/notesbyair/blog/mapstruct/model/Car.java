package com.notesbyair.blog.mapstruct.model;

import com.notesbyair.blog.mapstruct.example.CarType;

public  class Car {
    private String make;
    private SeatConfiguration seatConfiguration;
    private CarType type;

    public Car() {
    }

    public Car(String make, SeatConfiguration seatConfiguration, CarType type) {
        this.make = make;
        this.seatConfiguration = seatConfiguration;
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public SeatConfiguration getSeatConfiguration() {
        return seatConfiguration;
    }

    public void setSeatConfiguration(SeatConfiguration seatConfiguration) {
        this.seatConfiguration = seatConfiguration;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }
}
