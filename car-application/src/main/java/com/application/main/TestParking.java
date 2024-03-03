package com.application.main;

import com.application.Car;
import com.application.CarType;
import com.application.Ticket;
import com.application.exception.ParkingFullException;
import com.application.service.ParkingLot;

public class TestParking {
public static void main(String[] args) throws ParkingFullException {
	ParkingLot parkingLot = ParkingLot.getParkingLot();
	parkingLot.intinalizeparkingSlots(10, 10);
	
	Car car = new Car("SUV", CarType.SUV);
	Ticket ticket = parkingLot.park(car);
	System.out.println(ticket);
	
	Car car1= new Car("hatchback", CarType.hatchback);
	Ticket ticket1 = parkingLot.park(car1);
	System.out.println(ticket1);
}
}
