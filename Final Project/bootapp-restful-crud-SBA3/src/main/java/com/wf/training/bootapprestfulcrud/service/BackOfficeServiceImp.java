package com.wf.training.bootapprestfulcrud.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wf.training.bootapprestfulcrud.dto.InvestorInputDto;
import com.wf.training.bootapprestfulcrud.dto.InvestorOutputDto;
import com.wf.training.bootapprestfulcrud.entity.Investor;
import com.wf.training.bootapprestfulcrud.repository.InvestorRepository;

// @Component
@Service
public class BackOfficeServiceImp implements BackOfficeService {

	// inject repository as dependency
	@Autowired
	private InvestorRepository repository;
	
	// utility method
	private InvestorOutputDto convertEntityToOutputDto(Investor investor) {
		InvestorOutputDto investorOutputDto = new InvestorOutputDto();
		
		investorOutputDto.setAmountinvested(investor.getAmountinvested());
		investorOutputDto.setEmail(investor.getEmail());
		investorOutputDto.setFirstname(investor.getFirstname());
		investorOutputDto.setLastname(investor.getLastname());
		investorOutputDto.setMobile(investor.getMobile());
		investorOutputDto.setPannumber(investor.getPannumber());
		investorOutputDto.setPassword("****");
		investorOutputDto.setUserid(investor.getUserid());
		return investorOutputDto;
	}
	
	private Investor covertInputDtoToEntity(InvestorInputDto investorInputDto) {
		Investor investor = new Investor();
		
		investor.setAmountinvested(investorInputDto.getAmountinvested());
		investor.setEmail(investorInputDto.getEmail());
		investor.setFirstname(investorInputDto.getFirstname());
		investor.setLastname(investorInputDto.getLastname());
		investor.setMobile(investorInputDto.getMobile());
		investor.setPannumber(investorInputDto.getPannumber());
		investor.setPassword(investorInputDto.getPassword());
		investor.setUserid(investorInputDto.getUserid());
		return investor;
	}
	
	@Override
	public List<InvestorOutputDto> fetchAllInvestors_BackOffice() {
		
		// use repository to fetch data from DB
		List<Investor> investors = this.repository.findAll();
		// convert entity into dto
		List<InvestorOutputDto> investorDtos = 
				investors.stream()
							 .map(this :: convertEntityToOutputDto)
							 .collect(Collectors.toList());
		return investorDtos;
	}

	@Override
	public InvestorOutputDto fetchSingleInvestorDetails_BackOffice(String pannumber) {
		// fetch record from DB
		//Investor investor = this.repository.findById(pannumber).orElse(null);
		
		//Investor investor = this.repository.findById(pannumber).orElse(null);
		Investor investor = this.repository.findInvestorByPAN(pannumber);
		
		// convert entity into output dto
		InvestorOutputDto investorOutputDto =  this.convertEntityToOutputDto(investor);
		return investorOutputDto;
	}

	@Override
	public InvestorOutputDto addInvestor_BackOffice(InvestorInputDto investorInputDto) {
		// convert dto into entity
		Investor investor = this.covertInputDtoToEntity(investorInputDto);
		// save entity in DB : returns the copy of newly added record back
		Investor newInvestor = this.repository.save(investor);
		// convert entity into output dto
		InvestorOutputDto investorOutputDto = this.convertEntityToOutputDto(newInvestor);
		return investorOutputDto;
	}
}
