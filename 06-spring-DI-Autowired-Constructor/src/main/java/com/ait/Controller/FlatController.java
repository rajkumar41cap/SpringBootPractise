package com.ait.Controller;

import org.springframework.stereotype.Controller;

import com.ait.Service.RBI;

@Controller
public class FlatController {
	private RBI rbi;

	public FlatController(RBI rbi) {
		this.rbi = rbi;
	}
	
	public String getInterestRateForFlat() {
		return rbi.getInterest();
	}
}
