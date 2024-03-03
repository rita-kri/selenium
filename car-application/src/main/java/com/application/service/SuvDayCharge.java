package com.application.service;

public class SuvDayCharge implements ParkingChargeStrategy{

	@Override
	public int getCharge(int parkHours) {
		if(parkHours<1) {
			return 20;
		}
		return parkHours*20;
	}
	

}
