package com.pariontech.mapstructdemo.domain;

import com.pariontech.mapstructdemo.api.CarType;

/**
 * @author oguz, created on 2018.11.24
 *
 */

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

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public CarType getType() {
		return type;
	}

	public void setType(CarType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", numberOfSeats=" + numberOfSeats + ", type=" + type + "]";
	}
}
