package com.ait.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.ait.service.BusBooking;

@Controller
public class BusBookingController {
	private BusBooking busbooking;
	@Autowired
	@Qualifier(value="redbus")
	public void setBusbooking(@Qualifier(value="abhibus")BusBooking busbooking) {
		this.busbooking = busbooking;
	}
	
	public String bookBusTikcet() {
		return busbooking.bookTicket();
	}
}
