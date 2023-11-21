package com.app.utils;

import org.springframework.stereotype.Component;

import com.app.dto.UserLoginResponse;
import com.app.pojos.User;

@Component
public class CommonUtils {

	public UserLoginResponse convertToLoginResponse(User user, String role) {
		UserLoginResponse loginResponse =  new UserLoginResponse();
		loginResponse.setFirstName(user.getFirstName());
		loginResponse.setLastName(user.getLastName());
		loginResponse.setEmail(user.getEmail());
		loginResponse.setContactNo(user.getContactNo());
		loginResponse.setRoleName(role);
		
		return loginResponse;
	}
	
	
}
