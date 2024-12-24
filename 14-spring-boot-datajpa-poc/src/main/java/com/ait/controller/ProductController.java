package com.ait.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ait.bean.ProductsBean;
import com.ait.service.ProductsService;

@Controller
public class ProductController {
	@Autowired
	ProductsService prodService;
	
	public List<ProductsBean> getProducts(){
		prodService.getProducts();
		return null;
	}
	
	public ProductsBean getProducts(String prodCode) {
		ProductsBean products = prodService.getProducts(prodCode);
		return products;
	}
	
	public ProductsBean getProducts(String prodName,String prodLine) {
		prodService.getProducts(prodName,prodLine);
		return null;
	}
}
