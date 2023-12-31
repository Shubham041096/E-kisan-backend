package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
//for testing purpose
@RestController
@RequestMapping("/ekisan")
@Slf4j
public class TestController {
	public TestController() {
		log.info("in ctor of "+getClass());
	}
	@GetMapping("/home")
	public String showHome()
	{
		return "in home page...";//@RespBody 
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
