package com.wf.training.bootapprestfulcrud.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wf.training.bootapprestfulcrud.dto.CompanyDTO;
import com.wf.training.bootapprestfulcrud.dto.SearchCompanyDto;
import com.wf.training.bootapprestfulcrud.dto.StockPriceDto;
import com.wf.training.bootapprestfulcrud.entity.Company;
import com.wf.training.bootapprestfulcrud.entity.HistoricalRecordCompany;
import com.wf.training.bootapprestfulcrud.repository.CompanyHistoricalDataRepository;
import com.wf.training.bootapprestfulcrud.repository.CompanyRepository;

@Service
public class CompanyServiceImp implements CompanyService {

	@Autowired
	private CompanyRepository CompanyRepository;

	@Autowired
	private CompanyHistoricalDataRepository CompanyHistoricalDataRepository;

	@Override
	public List<CompanyDTO> fetchAllCompanies() {
		List<Company> company = this.CompanyRepository.findAll();
		List<CompanyDTO> dto = new ArrayList<CompanyDTO>();
		for (Company c : company)
			dto.add(this.convertCompanyEntityToOutputDto(c));
		return dto;
	}

	@Override
	public List<String> fetchAllCompanyNames() {
		List<CompanyDTO> companyList = this.fetchAllCompanies();
		List<String> companyNames = new ArrayList<String>();
		for (CompanyDTO c : companyList)
			companyNames.add(c.getCompanyTitle());

		return companyNames;
	}

	@Override
	public CompanyDTO fetchSingleCompany(Long id) {
		// fetch record from DB
		Company company = this.CompanyRepository.findById(id).orElse(null);
		// convert entity into output dto
		CompanyDTO companyOutputDto = this.convertCompanyEntityToOutputDto(company);
		return companyOutputDto;
	}

	@Override
	public CompanyDTO fetchSingleCompanyByName(SearchCompanyDto searchCompanyDto) {

		Company company = this.convertSearchCompanyDtoToEntity(searchCompanyDto);
		Company newcompany = this.CompanyRepository.findBycompanyTitle(company.getCompanyTitle())
				.orElseThrow(() -> new NullPointerException());
		CompanyDTO companyOutputDto = this.convertCompanyEntityToOutputDto(newcompany);
		return companyOutputDto;
	}

	@Override
	public CompanyDTO addCompany(CompanyDTO addCompanyInputDto) {
		CompanyDTO addCompanyOutputDto = new CompanyDTO();

		Company company = this.convertInputAddCompanyToEntity(addCompanyInputDto);
		Company newCompany = this.CompanyRepository.save(company);
		addCompanyOutputDto = this.convertCompanyEntityToOutputDto(newCompany);

		return addCompanyOutputDto;
	}

	@Override
	public CompanyDTO editCompany(Long id, SearchCompanyDto employeeInputDto) {
		return null;
	}

	@Override
	public CompanyDTO modifyCompany(CompanyDTO companyOutputDto) {
		Company company = this.convertCompanyOutputToEntity(companyOutputDto);
		Company modifyCompany = this.CompanyRepository.save(company);

		CompanyDTO companyNewOutputDto = this.convertCompanyEntityToOutputDto(modifyCompany);

		return companyNewOutputDto;
	}

	@Override
	public CompanyDTO deleteCompany(Long id) {
		return null;
	}

	@Override
	public boolean addStockPrice(StockPriceDto addStockDto) {
		Company company = this.CompanyRepository.findBycompanyTitle(addStockDto.getCompanyName()).orElse(null);
		if (company != null) {
			HistoricalRecordCompany entity = new HistoricalRecordCompany();
			entity.setCompanyCode(company.getCompanyCode());
			entity.setCurrency(company.getCurrency());
			entity.setStockPrice(addStockDto.getSharePrice());
			entity.setDateTime(LocalDateTime.now().toString());
			this.CompanyHistoricalDataRepository.save(entity);

			return true;
		}

		return false;
	}

	@Override
	public CompanyDTO fetchSingleCompanyByName(String companyTitle) {
		Company company = this.CompanyRepository.findBycompanyTitle(companyTitle).orElse(null);
		CompanyDTO companyDto = this.convertCompanyEntityToOutputDto(company);
		return companyDto;
	}

	private Company convertInputAddCompanyToEntity(CompanyDTO addCompanyInputDto) {
		Company company = new Company();

		company.setCompanyTitle(addCompanyInputDto.getCompanyTitle());
		company.setOperation(addCompanyInputDto.getOperation());
		company.setShareCount(addCompanyInputDto.getShareCount());
		company.setSharePrice(addCompanyInputDto.getSharePrice());
		company.setSector(addCompanyInputDto.getSector());
		company.setCurrency(addCompanyInputDto.getCurrency());
		company.setTurnover(addCompanyInputDto.getTurnover());
		company.setDateTimeIPO(addCompanyInputDto.getDateTimeIPO());
		company.setStockExchange(addCompanyInputDto.getStockExchange());
		company.setIpoPrice(addCompanyInputDto.getIpoPrice());

		return company;
	}

	public CompanyDTO convertCompanyEntityToOutputDto(Company company) {
		CompanyDTO companyOutputCompany = new CompanyDTO();

		companyOutputCompany.setCompanyCode(company.getCompanyCode());
		companyOutputCompany.setCompanyTitle(company.getCompanyTitle());
		companyOutputCompany.setOperation(company.getOperation());
		companyOutputCompany.setShareCount(company.getShareCount());
		companyOutputCompany.setSharePrice(company.getSharePrice());
		companyOutputCompany.setSector(company.getSector());
		companyOutputCompany.setCurrency(company.getCurrency());
		companyOutputCompany.setTurnover(company.getTurnover());
		companyOutputCompany.setDateTimeIPO(company.getDateTimeIPO());
		companyOutputCompany.setStockExchange(company.getStockExchange());
		companyOutputCompany.setIpoPrice(company.getIpoPrice());

		return companyOutputCompany;
	}

	private Company convertCompanyOutputToEntity(CompanyDTO companyOutputDto) {
		Company company = new Company();

		company.setCompanyCode(companyOutputDto.getCompanyCode());
		company.setCompanyCode(companyOutputDto.getCompanyCode());
		company.setCompanyTitle(companyOutputDto.getCompanyTitle());
		company.setOperation(companyOutputDto.getOperation());
		company.setShareCount(companyOutputDto.getShareCount());
		company.setSharePrice(companyOutputDto.getSharePrice());
		company.setSector(companyOutputDto.getSector());
		company.setCurrency(companyOutputDto.getCurrency());
		company.setTurnover(companyOutputDto.getTurnover());
		company.setDateTimeIPO(companyOutputDto.getDateTimeIPO());
		company.setStockExchange(companyOutputDto.getStockExchange());
		company.setIpoPrice(companyOutputDto.getIpoPrice());

		return company;
	}

	private Company convertSearchCompanyDtoToEntity(SearchCompanyDto searchCompanyDto) {
		/*
		 * Company company = new Company();
		 * 
		 * company.setCompanyTitle(searchCompanyDto.getCompanyName());
		 * 
		 * return company;
		 */
		
		return null;
	}

}
