package com.ait.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.ait.service.FlightService;
import com.ait.serviceImp.AirIndia;
import com.ait.serviceImp.Akasha;
import com.ait.serviceImp.Indigo;

@Configuration
public class FlightServiceFactory {
	@Autowired
	private AirIndia airIndia;
	@Autowired
	private Akasha akasha;
	@Autowired
	private Indigo indigo;
	public FlightService getImpementation(String flightOperator) {
		if ("airIndia".equalsIgnoreCase(flightOperator))
			return airIndia;
		else if ("akasha".equalsIgnoreCase(flightOperator))
			return akasha;
		else if ("indigo".equalsIgnoreCase(flightOperator))
			return indigo;
		else {
			throw new IllegalArgumentException("No flight operator available");
		}
	}
}
