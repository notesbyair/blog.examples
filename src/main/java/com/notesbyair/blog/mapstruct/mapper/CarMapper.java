package com.notesbyair.blog.mapstruct.mapper;

import com.notesbyair.blog.mapstruct.example.SeatConfigurationDto;
import com.notesbyair.blog.mapstruct.model.Car;
import com.notesbyair.blog.mapstruct.example.CarDto;
import com.notesbyair.blog.mapstruct.model.SeatConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {
    CarMapper INSTANCE = Mappers.getMapper( CarMapper.class );
    @Mapping(target = "seats", source = "seatConfiguration")
    CarDto convert(Car car);

    @Mapping(source = "numberOfSeats", target = "seatCount")
    @Mapping(source = "seatMaterial", target = "material")
    SeatConfigurationDto seatConfigurationToSeatConfigurationDto(SeatConfiguration seatConfiguration);
}
