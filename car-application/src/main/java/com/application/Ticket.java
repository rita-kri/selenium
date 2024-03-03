package com.application;

import java.util.Date;

public class Ticket {
	
	private int slotNumber;
	private String carNumber;
	private CarType carType;
	private Date date;
	
	
	
	public Ticket(int slotNumber, String carNumber, CarType carType, Date date) {
		super();
		this.slotNumber = slotNumber;
		this.carNumber = carNumber;
		this.carType = carType;
		this.date = date;
	}
	
	public CarType getCarType() {
		return carType;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
	}

	public int getSlotNumber() {
		return slotNumber;
	}
	public void setSlotNumber(int slotNumber) {
		this.slotNumber = slotNumber;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
