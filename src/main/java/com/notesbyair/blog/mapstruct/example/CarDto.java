package com.notesbyair.blog.mapstruct.example;

public class CarDto {
    private String make;
    private SeatConfigurationDto seats;
    private String type;

    public CarDto() {
    }

    public CarDto(String make, SeatConfigurationDto seats, String type) {
        this.make = make;
        this.seats = seats;
        this.type = type;
    }

    @Override
    public String toString() {
        return "CarDto{" +
                "make='" + make + '\'' +
                ", seats=" + seats +
                ", type='" + type + '\'' +
                '}';
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public SeatConfigurationDto getSeats() {
        return seats;
    }

    public void setSeats(SeatConfigurationDto seats) {
        this.seats = seats;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
