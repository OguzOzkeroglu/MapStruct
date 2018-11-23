## What is MapStruct?
MapStruct is a Java [annotation processor](http://docs.oracle.com/javase/6/docs/technotes/guides/apt/index.html) for the generation of type-safe and performant mappers for Java bean classes.

## Car Class

```java
public class Car {
	private String make;
	private int numberOfSeats;
	private CarType type;

	public Car() {
		super();
	}

	public Car(String make, int numberOfSeats, CarType type) {
		this.make = make;
		this.numberOfSeats = numberOfSeats;
		this.type = type;
	}
  
  //... getters and setters
}
```

## CarDto Class

```java
public class CarDto {
	private String make;
	private int seatCount;
	private String type;

	public CarDto() {
	}

	public CarDto(String make, int seatCount, String type) {
		this.make = make;
		this.seatCount = seatCount;
		this.type = type;
	}
  
  //... getters and setters
}
```

## And finally Mapper Interface

```java
@Mapper
public interface CarMapper {
	CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

	@Mapping(source = "numberOfSeats", target = "seatCount")
	CarDto carToCarDto(Car car);

	@Mapping(source = "seatCount", target = "numberOfSeats")
	Car carDtoToCar(CarDto carDto);
}
```

## Test Case

```java
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
```

Most of sample codes and test case taken from [official MapStruct page](http://mapstruct.org/).
