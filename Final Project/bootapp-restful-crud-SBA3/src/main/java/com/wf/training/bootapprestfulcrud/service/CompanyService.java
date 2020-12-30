package com.wf.training.bootapprestfulcrud.service;

import java.util.List;

import com.wf.training.bootapprestfulcrud.dto.CompanyDTO;
import com.wf.training.bootapprestfulcrud.dto.SearchCompanyDto;
import com.wf.training.bootapprestfulcrud.dto.StockPriceDto;



public interface CompanyService {

	public List<CompanyDTO> fetchAllCompanies();
	public CompanyDTO fetchSingleCompany(Long id);
	public CompanyDTO addCompany(CompanyDTO addCompanyInputDto);
	public CompanyDTO editCompany(Long id, SearchCompanyDto searchCompanyDto);
	public CompanyDTO deleteCompany(Long id);
	public CompanyDTO fetchSingleCompanyByName(SearchCompanyDto searchCompanyDto);
	public CompanyDTO fetchSingleCompanyByName(String companyTitle);
	public CompanyDTO modifyCompany(CompanyDTO companyOutputDto);
	public boolean addStockPrice(StockPriceDto addStockDto);
	public List<String> fetchAllCompanyNames();
	
}
