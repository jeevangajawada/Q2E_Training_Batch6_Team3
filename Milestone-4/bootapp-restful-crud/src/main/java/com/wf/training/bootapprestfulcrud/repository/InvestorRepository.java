package com.wf.training.bootapprestfulcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wf.training.bootapprestfulcrud.entity.Investor;

// @Component
@Repository
public interface InvestorRepository extends JpaRepository<Investor, Long>{
    // nothing to add
}
