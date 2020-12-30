package com.wf.training.bootapprestfulcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wf.training.bootapprestfulcrud.entity.AdminUser;

@Repository
public interface AdminUserRepository extends JpaRepository<AdminUser, Integer>{

	AdminUser findById(int id);

	AdminUser findByadminUserId(Integer adminUserId);
	
	AdminUser findByName(String name);
	
	
}
