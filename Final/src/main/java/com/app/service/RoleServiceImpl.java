package com.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IRoleRepository;
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

	
	
}
