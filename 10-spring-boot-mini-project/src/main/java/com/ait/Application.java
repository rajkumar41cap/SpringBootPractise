package com.ait;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ait.bean.FlightBooking;
import com.ait.controller.FlightBookingController;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		FlightBooking booking=new FlightBooking();
		booking.setName("Raja");
		booking.setSource("New Delhi");
		booking.setDestination("Pune");
		booking.setDate("03/12/2024");
		booking.setFlightOperator("airIndia");
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		FlightBookingController bean = run.getBean(FlightBookingController.class);
		bean.bookFlightTikcet(booking);
	}

}
