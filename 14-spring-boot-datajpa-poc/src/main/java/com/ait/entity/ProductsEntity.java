package com.ait.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "products")
public class ProductsEntity {
	@Id
	private String productCode;
	private String productName;
	private String productLine;
	private String productVendor;
	private String productDescription;
	private int quantityInStocks;
	private double buyPrice;
	private double MSRP;
}
