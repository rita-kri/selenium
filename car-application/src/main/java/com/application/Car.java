package com.application;

public class Car {
	
	private String carNumber;
	private CarType carType;
	
	

	public Car(String carNumber, CarType carType) {
		super();
		this.carNumber = carNumber;
		this.carType = carType;
	}

	public Car(String carNumber) {
		super();
		this.carNumber = carNumber;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public CarType getCarType() {
		return carType;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
	}
	
	

}
