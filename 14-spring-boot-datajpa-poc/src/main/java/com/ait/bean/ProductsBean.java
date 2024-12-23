package com.ait.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductsBean {
	private String productCode;
	private String productName;
	private String productLine;
	private String productVendor;
	private String productDescription;
	private int quantityInStocks;
	private double buyPrice;
	private double MSRP;
}
