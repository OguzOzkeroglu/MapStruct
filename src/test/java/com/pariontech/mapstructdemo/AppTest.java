package com.pariontech.mapstructdemo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.pariontech.mapstructdemo.api.CarType;
import com.pariontech.mapstructdemo.api.dto.CarDto;
import com.pariontech.mapstructdemo.api.mapper.CarMapper;
import com.pariontech.mapstructdemo.domain.Car;

/**
 * @author oguz, created on 2018.11.24
 *
 */

public class AppTest {
	@Test
	public void shouldMapCarToDto() {
		// given
		Car car = new Car("Morris", 5, CarType.SEDAN);

		// when
		CarDto carDto = CarMapper.INSTANCE.carToCarDto(car);

		// then
		assertThat(carDto).isNotNull();
		assertThat(carDto.getMake()).isEqualTo("Morris");
		assertThat(carDto.getSeatCount()).isEqualTo(5);
		assertThat(carDto.getType()).isEqualTo("SEDAN");
	}
}
