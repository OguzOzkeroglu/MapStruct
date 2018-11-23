package com.pariontech.mapstructdemo.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.pariontech.mapstructdemo.api.dto.CarDto;
import com.pariontech.mapstructdemo.domain.Car;

/**
 * @author oguz, created on 2018.11.24
 *
 */

@Mapper
public interface CarMapper {
	CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

	@Mapping(source = "numberOfSeats", target = "seatCount")
	CarDto carToCarDto(Car car);

	@Mapping(source = "seatCount", target = "numberOfSeats")
	Car carDtoToCar(CarDto carDto);
}
