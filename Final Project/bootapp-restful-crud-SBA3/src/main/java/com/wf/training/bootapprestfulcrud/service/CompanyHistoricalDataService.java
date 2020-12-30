package com.wf.training.bootapprestfulcrud.service;

import java.util.List;

import com.wf.training.bootapprestfulcrud.dto.CompanyHistoricalDataOutputDto;


public interface CompanyHistoricalDataService {
	
	public List<CompanyHistoricalDataOutputDto> fetchAllCompanies();
	
	List<CompanyHistoricalDataOutputDto> fetchSingleByCompanyId(Long companyCode);

}
