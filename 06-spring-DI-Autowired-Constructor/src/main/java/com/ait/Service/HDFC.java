package com.ait.Service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Qualifier(value="hdfclaon")
@Primary
public class HDFC implements RBI {

	@Override
	public String getInterest() {
		return "HDFC loan interest: 8.5%";
	}

}
