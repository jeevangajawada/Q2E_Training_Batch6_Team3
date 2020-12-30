package com.wf.training.bootapprestfulcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.wf.training.bootapprestfulcrud.entity.LoginPage;

// @Component
@Repository
public interface BackOfficeRepository extends JpaRepository<LoginPage, Long>{
    // nothing to add
	
	
}
