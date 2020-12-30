package com.wf.training.bootapprestfulcrud.service;

import java.util.List;

import com.wf.training.bootapprestfulcrud.dto.InvestorInputDto;
import com.wf.training.bootapprestfulcrud.dto.InvestorOutputDto;

public interface BackOfficeService {

	
	  public List<InvestorOutputDto> fetchAllInvestors_BackOffice();
	  public InvestorOutputDto fetchSingleInvestorDetails_BackOffice(String pannumber);
	  public InvestorOutputDto addInvestor_BackOffice(InvestorInputDto investorInputDto);
	 
	
}