package com.ait.serviceImp;

import org.springframework.stereotype.Service;

import com.ait.service.RBI;

@Service("iciciloan")
public class ICICI implements RBI{
	@Override
	public String homeLoan() {
		return "Current Home loan Interest by ICICI is 8.5%..!!";
	}
}
