package com.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.custom_exception.ResourceNotFoundException;
import com.app.dao.ICategoryRepository;
import com.app.dao.IProductsRepository;
import com.app.pojos.Category;
import com.app.pojos.Products;

@Service
@Transactional
public class CategoryServiceImpl implements ICategoryService {

	@Autowired
	ICategoryRepository categoryRepository;

	@Override
	public List<Category> showAllCategory() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}
}
