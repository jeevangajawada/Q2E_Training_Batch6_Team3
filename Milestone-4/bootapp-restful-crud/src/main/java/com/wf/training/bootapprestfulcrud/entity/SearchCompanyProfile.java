package com.wf.training.bootapprestfulcrud.entity;

import javax.validation.constraints.*;

public class SearchCompanyProfile {
	
	@NotBlank(message = "Company Name is mandatory!")
	private String searchCompany;
	
	
	public String getSearchCompany() {
		return searchCompany;
	}

	public void setSearchCompany(String searchCompany) {
		this.searchCompany = searchCompany;
	}
	
	
	
}
