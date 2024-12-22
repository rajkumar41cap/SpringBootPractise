package com.ait.Service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier(value="iciciloan")
public class ICICI implements RBI {

	@Override
	public String getInterest() {
		return "ICICI Home loan: 9.7%";
	}

}
