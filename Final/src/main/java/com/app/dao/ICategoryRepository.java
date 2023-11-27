package com.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.pojos.Category;
import com.app.pojos.Products;

public interface ICategoryRepository extends JpaRepository<Category, Integer> {
	
}
