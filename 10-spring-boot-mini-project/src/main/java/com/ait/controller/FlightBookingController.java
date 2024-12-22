package com.ait.controller;

import org.springframework.stereotype.Component;

import com.ait.bean.FlightBooking;
import com.ait.service.FlightService;
import com.ait.utility.FlightServiceFactory;

@Component
public class FlightBookingController {
	private final FlightServiceFactory flightServiceFactory;
	public FlightBookingController(FlightServiceFactory flightServiceFactory) {
		System.out.println("FlightBookingController: is initialized");
		this.flightServiceFactory = flightServiceFactory;
	}
	public void bookFlightTikcet(FlightBooking booking) {
		FlightService flightService=flightServiceFactory.getImpementation(booking.getFlightOperator());
		flightService.bookFlight(booking);
	}
	
}
