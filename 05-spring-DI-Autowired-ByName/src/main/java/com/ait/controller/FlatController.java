package com.ait.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import com.ait.service.RBI;

@Controller
public class FlatController {
	@Autowired
	@Qualifier(value="iciciloan")
	private RBI rbi;
	public String getInterestForHomeLoan() {
		String interest=rbi.homeLoan();
		return interest;
	}
}
