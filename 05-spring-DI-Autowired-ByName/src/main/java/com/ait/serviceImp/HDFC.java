package com.ait.serviceImp;

import org.springframework.stereotype.Service;

import com.ait.service.RBI;

@Service("hdfcloan")
public class HDFC implements RBI {
	@Override
	public String homeLoan() {
		return "Current Home loan Interest by HDFC is 9.5%..!!";
	}
}
