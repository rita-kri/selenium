package com.application.service;

import com.application.Car;
import com.application.Ticket;
import com.application.exception.InValidCarException;
import com.application.exception.ParkingFullException;

public interface Parking {
	
	public Ticket park(Car car) throws ParkingFullException;
	public int upPark(Ticket ticket, ParkingChargeStrategy parkingChargeStrategy) throws InValidCarException;

}
