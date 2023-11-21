package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.pojos.Role;


public interface IRoleRepository extends JpaRepository<Role, Long>{

	@Query(value="select role_name from sec_roles sr join users_roles ur on ur.role_id =  sr.role_id where user_id = ?", nativeQuery = true)
	String findUserId(int userId);
}
