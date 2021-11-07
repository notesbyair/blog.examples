package com.notesbyair.blog.mapstruct.example;

public class SeatConfigurationDto {
    private int seatCount;
    private String material;

    public SeatConfigurationDto() {
    }

    @Override
    public String toString() {
        return "SeatConfigurationDto{" +
                "seatCount=" + seatCount +
                ", material='" + material + '\'' +
                '}';
    }

    public SeatConfigurationDto(int seatCount, String material) {
        this.seatCount = seatCount;
        this.material = material;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
