package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.pojos.Category;
import com.app.pojos.Products;

public interface ICategoryService {
	 
	//To display all category
	List<Category> showAllCategory();
	 
	Category addCat(Category category);
}
