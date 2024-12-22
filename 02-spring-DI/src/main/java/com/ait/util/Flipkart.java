package com.ait.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ait.serviceImp.BlueDartServiceImp;
import com.ait.serviceImp.DTDCServiceImp;
import com.ait.serviceImp.EkartServiceImp;

@Component
public class Flipkart {
	DTDCServiceImp dtdcServiceImp;
	@Autowired //Setter Injection
	public void setDtdcServiceImp(DTDCServiceImp dtdcServiceImp) {
		this.dtdcServiceImp = dtdcServiceImp;
	}
	BlueDartServiceImp blueDartImp;//Constructor Injection
	public Flipkart(BlueDartServiceImp blueDartImp) {
		super();
		this.blueDartImp=blueDartImp;
	}
	@Autowired
	EkartServiceImp ekartImp;
	public void sendCourier(String orderId, String address) {
		System.out.println("Courier Started");
		ekartImp.deliver(orderId, address);
	}
}
