package com.wf.training.bootapprestfulcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wf.training.bootapprestfulcrud.entity.InvestorWallet;

import java.util.Optional;

@Repository
public interface InvestorWalletRepository extends JpaRepository<InvestorWallet, Long>{
	
	Optional<InvestorWallet> findByInvestorID(int investorId);

//	Optional<RecentlyViewedCompanies> findByLoginKey(String loginKey);

}
