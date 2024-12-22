package com.ait.service;

import org.springframework.stereotype.Service;

@Service("abhibus")
public class AbhiBus implements BusBooking {

	@Override
	public String bookTicket() {
		return "AbhiBus";
	}

}
