package com.ait.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ait.service.BankService;

@Controller
public class FlatController {
	
	@Autowired
	BankService bankService;
	
	public String getInterestForHomeLoan() {
		String interest=bankService.getInterestRate();
		return interest;
	}
}
