package com.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.UserLoginResponse;
import com.app.pojos.User;
import com.app.pojos.UserLogin;
import com.app.service.IRoleService;
import com.app.service.IUserService;
import com.app.utils.CommonUtils;

@RestController
//@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("ekisan/user")
public class LoginController {

	@Autowired
	IUserService userService;
	
	@Autowired
	IRoleService iRoleService;
	
	@Autowired
	CommonUtils commonUtils;
	
	@GetMapping
	public Iterable<User> displayAllUsers(){
		return userService.getAllUsers();
	} 
	
	@PostMapping("/register")
	public String addCustomer(@RequestBody @Valid User u) {
		userService.addUser(u);
		return "Successfully added";
	}
	
	@PostMapping("/login")
	public UserLoginResponse loginValidateCustomer(@RequestBody @Valid UserLogin u, BindingResult result ) {	
		User newUser =  userService.loginUser(u.getEmail(),u.getPassword());
		String role = iRoleService.getRoleByUserId(newUser.getUserId());
		UserLoginResponse userLoginResponse =commonUtils.convertToLoginResponse(newUser,role);
		
		return userLoginResponse;
	}
}
