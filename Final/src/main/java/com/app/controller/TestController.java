package com.app.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Category;
import com.app.service.ICategoryService;

import lombok.extern.slf4j.Slf4j;
//for testing purpose
@RestController
@RequestMapping("/ekisan")
@Slf4j
public class TestController {
	private static final Logger log = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	ICategoryService categoryService;
	
	public TestController() {
		log.info("in ctor of "+getClass());
	}
	@GetMapping("/home")
	public String showHome()
	{
		return "in home page...";//@RespBody 
	}
	
	@GetMapping
	public List<Category> getCartegory() {
		return categoryService.showAllCategory();
		
	}
//	@GetMapping("/user")
//	public String showUser()
//	{
//		return "in user page...";//@RespBody 
//	}
//	@GetMapping("/admin")
//	public String showAdmin()
//	{
//		return "in admin page...";//@RespBody 
//	}
	
	@GetMapping("/buyer")
	public String buyerController() {
		return "inside buyerController";
	}
	
	@GetMapping("/seller")
	public String sellerController() {
		return "inside sellerController";
	}

}
