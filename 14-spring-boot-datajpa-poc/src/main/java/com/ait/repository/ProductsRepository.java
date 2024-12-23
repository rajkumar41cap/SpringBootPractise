package com.ait.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.ait.entity.ProductsEntity;

public interface ProductsRepository extends JpaRepository<ProductsEntity, String> {
	@Query(value = "select * from products;", nativeQuery = true)
	public List<ProductsEntity> getProducts();

	@Query(value = "select * from products where productCode=:prodCode;", nativeQuery = true)
	public ProductsEntity getProducts(String prodCode);

	@Query(value = "select * from products where productLine=:prodLine and prodName=:prodName;", nativeQuery = true)
	public ProductsEntity getProducts(String prodName, String prodLine);
}
