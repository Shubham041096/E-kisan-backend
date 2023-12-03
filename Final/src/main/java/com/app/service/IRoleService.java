package com.app.service;

import java.util.List;

import com.app.pojos.Role;


public interface IRoleService {

	String getRoleByUserId(int userId);

	List<Role> getAllUsers();
	
	List<Role> addSecUsers(List<Role> newRoles);
}
