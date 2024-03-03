package com.application;

public class Slot {
	private Integer number;
	private boolean isEmpty;
	private Car parkCar;
	
	
	public Slot(Integer number) {
		super();
		this.number = number;
	}
	
	
	public Integer getSlotNumber() {
		return number;
	}


	public void setNumber(Integer number) {
		this.number = number;
	}


	public boolean isEmpty() {
		return isEmpty;
	}
	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}
	public Car getParkCar() {
		return parkCar;
	}
	public void setParkCar(Car parkCar) {
		this.parkCar = parkCar;
	}
	
	public void vacateSlot() {
		parkCar = null;
		this.isEmpty= true;
		
	}
	
	public void occupySlot(Car parCar) {
		this.parkCar= parCar;
		this.isEmpty=false;
	}

}
