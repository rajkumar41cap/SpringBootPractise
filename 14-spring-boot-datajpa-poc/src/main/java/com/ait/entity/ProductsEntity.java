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
