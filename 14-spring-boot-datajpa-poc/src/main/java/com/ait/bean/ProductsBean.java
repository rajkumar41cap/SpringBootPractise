package com.ait.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductsBean {
	private String productcode;
	private String productname;
	private String productline;
	private String productscale;
	private String productvendor;
	private String productdescription;
	private int quantityinstock;
	private double buyprice;
	private double MSRP;
}
