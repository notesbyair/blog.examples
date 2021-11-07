package com.notesbyair.blog.mapstruct.model;

public class SeatConfiguration {
    private int numberOfSeats;
    private SeatMaterial seatMaterial;

    public SeatConfiguration() {
    }

    public SeatConfiguration(int numberOfSeats, SeatMaterial seatMaterial) {
        this.numberOfSeats = numberOfSeats;
        this.seatMaterial = seatMaterial;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public SeatMaterial getSeatMaterial() {
        return seatMaterial;
    }

    public void setSeatMaterial(SeatMaterial seatMaterial) {
        this.seatMaterial = seatMaterial;
    }
}
