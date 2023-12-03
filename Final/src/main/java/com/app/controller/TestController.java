package com.app.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Category;
import com.app.pojos.Products;
import com.app.pojos.Role;
import com.app.pojos.User;
import com.app.service.ICategoryService;
import com.app.service.IRoleService;
import com.app.service.IUserService;

import lombok.extern.slf4j.Slf4j;
//for testing purpose
@RestController
@RequestMapping("/ekisan")
@Slf4j
public class TestController {
	private static final Logger log = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	ICategoryService categoryService;
	
	@Autowired
	IUserService userService;
	
	@Autowired
	IRoleService roleService;
	
	public TestController() {
		log.info("in ctor of "+getClass());
	}
	@GetMapping("/home")
	public String showHome()
	{
		return "in home page...";//@RespBody 
	}
	
	@GetMapping("getCategory")
	public List<Category> getCartegory() {
		return categoryService.showAllCategory();	
	}
	
	@GetMapping("getUsers")
	public List<User> getUsers() {
		return userService.getAllUsers();
	}
	
	@GetMapping("getRoles")
	public List<User> getRoles() {
		return userService.getAllUsers();
	}
	
	@GetMapping("getSecRoles")
	public List<Role> getSecRoles() {
		return roleService.getAllUsers();
	}
	
	@PostMapping("addSecRoles")
	public List<Role> addSecRoles(@RequestBody List<Role> newRoles) {
		return roleService.addSecUsers(newRoles);
	}
	
	@PostMapping("addCat")
	public Category addCategory(@RequestBody Category category) {
		return categoryService.addCat(category);
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
