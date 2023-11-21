package com.app.dto;

import com.app.pojos.UserRole;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserLoginResponse {
	private String firstName;
	private String lastName;
	private String email;
	private String contactNo;
	private String roleName;
	
}
