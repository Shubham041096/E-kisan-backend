package com.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.app.pojos.Products;

public interface IProductsRepository extends JpaRepository<Products, Integer> {
	//Products findByProdName(String name);
	
	//Searching product by name
	Optional<Products> findByProdName(String name);
	
	//Searching product by name
	Optional<Products> findByEmail(String name);
	
	@Query(value="select prodName from Products where prodname=?1", nativeQuery = true)
	//@Query("select u.prodName from Products u where u.prodName=?1")
	String productName(String name);
	
	@Modifying
	@Query(value="update PRODUCTS set IS_ACTIVE = ?1 where PROD_ID = ?2", nativeQuery = true)
	int updateActiveFlag(int isActive, String prodId);
}
