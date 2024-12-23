package com.ait.serviceImp;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ait.bean.ProductsBean;
import com.ait.entity.ProductsEntity;
import com.ait.repository.ProductsRepository;
import com.ait.service.ProductsService;
@Service
public class ProductServiceImp implements ProductsService {
	@Autowired
	ProductsRepository prodRepo;
	
	@Override
	public List<ProductsBean> getProducts() {
		List<ProductsEntity> products = prodRepo.getProducts();
		Iterator<ProductsEntity> it=products.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		return null;
	}

	@Override
	public ProductsBean getProducts(String prodCode) {
		ProductsEntity products = prodRepo.getProducts(prodCode);
		System.out.println(products);
		return null;
	}

	@Override
	public ProductsBean getProducts(String prodName, String prodLine) {
		ProductsEntity products = prodRepo.getProducts(prodName, prodLine);
		System.out.println(products);
		return null;
	}

}
