package com.ait.service;

import org.springframework.stereotype.Service;

@Service("redbus")
public class RedBus implements BusBooking {
	@Override
	public String bookTicket() {
		return "RedBus";
	}

}
