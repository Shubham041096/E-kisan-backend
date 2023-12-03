package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IRoleRepository;
import com.app.pojos.Role;
import com.app.pojos.User;
@Service
@Transactional
public class RoleServiceImpl implements IRoleService{

	@Autowired
	IRoleRepository iRoleRepository;
	
	@Override
	public String getRoleByUserId(int userId) {
		// TODO Auto-generated method stub
		return iRoleRepository.findUserId(userId);
	}

	@Override
	public List<Role> getAllUsers() {
		// TODO Auto-generated method stub
		return (List<Role>) iRoleRepository.findAll();
	}

	@Override
	public List<Role> addSecUsers(List<Role> newRoles) {{
		return iRoleRepository.saveAll(newRoles);		
	}

	}
}
