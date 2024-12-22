package com.ait.serviceImp;

import org.springframework.stereotype.Component;

import com.ait.service.DeliveryService;
@Component
public class BlueDartServiceImp implements DeliveryService {

	@Override
	public void deliver(String id, String address) {
		System.out.println("Delivery Type:"+getClass().getName());
		System.out.println("Delivering Package:" + id + " Address:" + address);

	}

}
