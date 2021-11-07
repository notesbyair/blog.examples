package com.notesbyair.blog.mapstruct;

import com.notesbyair.blog.mapstruct.example.CarDto;
import com.notesbyair.blog.mapstruct.mapper.CarMapper;
import com.notesbyair.blog.mapstruct.example.CarType;
import com.notesbyair.blog.mapstruct.model.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() {
		Car car = new Car();
		car.setMake("Tesla");
		car.setType(CarType.SPORTS);
		car.setSeatConfiguration(new SeatConfiguration(1, SeatMaterial.LEATHER));
		CarDto carDTO = CarMapper.INSTANCE.convert(car);
		assertEquals(car.getMake(), car.getMake());
		assertEquals(car.getType(), car.getType());
		assertEquals(car.getSeatConfiguration().getSeatMaterial().toString(),
				carDTO.getSeats().getMaterial());
	}

}
