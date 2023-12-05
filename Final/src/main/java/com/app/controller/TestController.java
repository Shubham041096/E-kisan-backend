package com.app.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
import com.app.pojos.UserRole;
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
	
	
//	@GetMapping("/setUp")
//	public String getSetUp() {
//		//add Roles
//		Role role = new Role();
//		List<Role> roles = new ArrayList<Role>();
//		role.setRoleName(UserRole.ROLE_BUYER);
//		roles.add(role);
//		role.setRoleName(UserRole.ROLE_SELLER);
//		roles.add(role);
//		role.setRoleName(UserRole.ROLE_ADMIN);
//		roles.add(role);
//		
//		//Add Users
//		User user = new User();
//		user.setEmail("shubham@gmail.com");
//		user.setFirstName("Shubham");
//		user.setLastName("Kognole");
//		user.setContactNo("9850438449");
//		user.setPassword("12345");
//		Set<Role> set = new HashSet<Role>();
//		Role role2 = new Role();
//		role2.setRoleName(UserRole.ROLE_BUYER);
//		set.add(role2);
//		user.setRoles(set);
//
//		
//		User user3 = new User();
//		user3.setEmail("arjun@gmail.com");
//		user3.setFirstName("Arjun");
//		user3.setLastName("Bahirshet");
//		user3.setContactNo("9545074343");
//		user3.setPassword("12345");
//		Set<Role> set1 = new HashSet<Role>();
//		Role role4 = new Role();
//		role4.setRoleName(UserRole.ROLE_SELLER);
//		set1.add(role4);
//		user3.setRoles(set1);
//		
//		
//		User user4 = new User();
//		user4.setEmail("bhavesh@gmail.com");
//		user4.setFirstName("Bhavesh");
//		user4.setLastName("Rathod");
//		user4.setContactNo("9856738283");
//		user4.setPassword("12345");
//		Set<Role> set2 = new HashSet<Role>();
//		Role role5 = new Role();
//		role5.setRoleName(UserRole.ROLE_ADMIN);
//		set2.add(role5);
//		user4.setRoles(set2);
//		
//		Category category = new Category();
//		category.setCatName("Vegetable");
//		
//		//Create Product object
//		Products products = new Products();
//		products.setEmail("arjun@gmail.com");
//		products.setProdName("Tomato");
//		products.setQuantity(1);
//		products.setIsActive(0);
//		products.setPrice(37);
//		Category category2 = new Category();
//		category2.setCatId(1);
//		products.setCatId(category2);
//		
//		
//		Products products1 = new Products();
//		products1.setEmail("arjun@gmail.com");
//		products1.setProdName("Potato");
//		products1.setQuantity(1);
//		products1.setIsActive(0);
//		products1.setPrice(32);
//		Category category3 = new Category();
//		category3.setCatId(1);
//		products1.setCatId(category3);
//	
//		Products products2 = new Products();
//		products2.setEmail("arjun@gmail.com");
//		products2.setProdName("Cucumber");
//		products2.setQuantity(1);
//		products2.setIsActive(0);
//		products2.setPrice(40);
//		Category category4 = new Category();
//		category4.setCatId(1);
//		products2.setCatId(category4);
//		
//		
//		
//		//call add role API
//		TestController controller = new TestController();
//		controller.addSecRoles(roles);
//		
//		//call add user API
//		LoginController loginController = new LoginController();
//		loginController.addCustomer(user);
//		loginController.addCustomer(user3);
//		loginController.addCustomer(user4);
//		
//		//call add category API
//		controller.addCategory(category);
//		
//		//call add product API
//		ProductController productController = new ProductController();
//		productController.saveProducts(products);
//		productController.saveProducts(products1);
//		productController.saveProducts(products2);
//		
//		
//		return "Success";
//	}
	
	
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
