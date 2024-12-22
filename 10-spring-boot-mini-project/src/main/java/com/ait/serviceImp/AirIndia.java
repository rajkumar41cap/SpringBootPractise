package com.ait.serviceImp;

import org.springframework.stereotype.Service;

import com.ait.bean.FlightBooking;
import com.ait.service.FlightService;
@Service
public class AirIndia implements FlightService {

	@Override
	public String bookFlight(FlightBooking booking) {
		System.out.println("Welcome to AirIndia: "+booking.getName());
		System.out.println("You are travelling from: "+booking.getSource()+" to: "+booking.getDestination());
		System.out.println("Journey Date is: "+booking.getDate());
		System.out.println("Happing Journey............!!!");
		return null;
	}

}
