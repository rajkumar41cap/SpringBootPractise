package com.ait.service;

import java.util.List;

import com.ait.bean.ProductsBean;

public interface ProductsService {
	public List<ProductsBean> getProducts();
	public ProductsBean getProducts(String prodCode);
	public ProductsBean getProducts(String prodName,String prodLine);
}
