package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.pojos.Products;

public interface IProductsService {
	 
	//To display all products
	List<Products> showAllProducts();
	
	 //To search product by name
	 Products getProductsByName(String name);
	 
	 //To search product by email
	 Products getProductsByEmail(String email);
	
	 //To add new product to db
	 Products addProduct(Products product); 
	 
	 //To update product
	 Products updateproductDetails(Products updatedProduct);
	 
	 //To update product flag
	 int updateproductFlag(int isActive, String prodId);
	 
	 //To delete the product
	 String deleteProduct(int id);
	 
	 
}
