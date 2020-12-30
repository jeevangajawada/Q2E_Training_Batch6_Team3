package com.wf.training.bootapprestfulcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wf.training.bootapprestfulcrud.entity.Investor;

// @Component
@Repository
public interface InvestorRepository extends JpaRepository<Investor, Long>{
    // nothing to add
	
	@Query("Select u from Investor u where u.pannumber=?1")
	public Investor findInvestorByPAN(String pannumber);
}
