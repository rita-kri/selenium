package com.application.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.application.Car;
import com.application.CarType;
import com.application.Slot;
import com.application.Ticket;
import com.application.exception.InValidCarException;
import com.application.exception.ParkingFullException;

public class ParkingLot implements Parking {
	
	private static ParkingLot parkingLot;
	private final List<Slot> suvSlots;
	private final List<Slot> hatchbackSlots;
	
	private ParkingLot() {
		this.suvSlots = new ArrayList<Slot>();
		this.hatchbackSlots = new ArrayList<Slot>();
	}
	
	public static ParkingLot getParkingLot() {
		if(parkingLot == null) {
			parkingLot= new ParkingLot();
		}
		return parkingLot;
	}
	
	public boolean intinalizeparkingSlots(int noOfSUVslots, int noOfhatchbackSlots) {
		 for(int i =1;i<=noOfSUVslots;i++) {
			 suvSlots.add(new Slot(i));
		 }
		 System.out.printf("Created a suv slot  with %s slots %n", noOfSUVslots);
		 
		 for(int i =1;i<=noOfhatchbackSlots;i++) {
			 hatchbackSlots.add(new Slot(i));
		 }
		 System.out.printf("Created a hatchback slot  with %s slots %n", noOfhatchbackSlots);
		return true;
	}
	

	@Override
	public Ticket park(Car car) throws ParkingFullException {
		 Slot nextAvailableSlot;
		 
		 if(car.getCarType().equals(CarType.SUV)) {
			 nextAvailableSlot = getNextAvaliableSUVSlot();
		 }
		 else {
			 nextAvailableSlot = getnextAvailableHatchbackSlot();
		 }
		nextAvailableSlot.occupySlot(car);
		System.out.printf("allocated slot number :%d \n ", nextAvailableSlot.getSlotNumber());
		
		Ticket ticket = new Ticket(nextAvailableSlot.getSlotNumber(), car.getCarNumber(), car.getCarType(), new Date());
		return ticket;
	}


	private Slot getNextAvaliableSUVSlot() throws ParkingFullException {
		for (Slot slot : suvSlots) {
			if (slot.isEmpty()) {
				return slot;
			}
		}
		throw new ParkingFullException("No Empty Slot available");
	}

	private Slot getnextAvailableHatchbackSlot() throws ParkingFullException {
		for (Slot slot : hatchbackSlots) {
			if (slot.isEmpty()) {
				return slot;
			}
		}
		throw new ParkingFullException("No Empty Slot available");
	}

	@Override
	public int upPark(Ticket ticket, ParkingChargeStrategy parkingChargeStrategy) throws InValidCarException {
		int costByHours = 0;
		Slot slot;
		try {
			if (ticket.getCarType().equals(CarType.SUV)) {
				slot = getSUVSlotByVehicleNumber(ticket.getCarNumber());
			} else {
				slot = gethatchbackSlotByNumber(ticket.getCarNumber());
			}
			slot.vacateSlot();
			int hours = getHoursParked(ticket.getDate(), new Date());
			costByHours = getCostByHours(hours, parkingChargeStrategy);
			System.out.println(
					"car with registration " + ticket.getCarNumber() + " at slot number " + slot.getSlotNumber()
							+ " was parked for " + hours + " hours and the total charge is " + costByHours);
		} catch (InValidCarException invalidVehicleNumber) {
			System.out.println(invalidVehicleNumber.getMessage());
			throw invalidVehicleNumber;
		}
		return costByHours;
	}

	private Slot gethatchbackSlotByNumber(String carNumber) throws InValidCarException {
		for (Slot slot : hatchbackSlots) {
			Car car = slot.getParkCar();
			if (car != null && car.getCarNumber().equals(carNumber)) {
				return slot;
			}
		}
		throw new InValidCarException("Hatchback with registration number " + carNumber + " not found");
	}
	



	private int getHoursParked(Date startDate, Date endDate) {
		long secs = (endDate.getTime() - startDate.getTime()) / 1000;
		int hours = (int) (secs / 3600);
		return hours;

	}

	private int getCostByHours(int parkHours, ParkingChargeStrategy parkingCostStrategy) {
		return parkingCostStrategy.getCharge(parkHours);
	}

	private Slot getSUVSlotByVehicleNumber(String carNumber) throws InValidCarException {
		for (Slot slot : suvSlots) {
			Car car = slot.getParkCar();
			if (car != null && car.getCarNumber().equals(carNumber)) {
				return slot;
			}
		}
		throw new InValidCarException(
				"SUV with registration number " + carNumber + " not found");
	}

	

}
