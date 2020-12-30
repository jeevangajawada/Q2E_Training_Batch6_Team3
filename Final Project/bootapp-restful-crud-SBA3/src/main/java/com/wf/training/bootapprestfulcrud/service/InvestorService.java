package com.wf.training.bootapprestfulcrud.service;

import java.util.List;

import com.wf.training.bootapprestfulcrud.dto.InvestorInputDto;
import com.wf.training.bootapprestfulcrud.dto.InvestorOutputDto;

public interface InvestorService {

	public List<InvestorOutputDto> fetchAllInvestors();
	public InvestorOutputDto fetchSingleInvestorDetails(String pannumber);
	public InvestorOutputDto addInvestor(InvestorInputDto investorInputDto);
	
}