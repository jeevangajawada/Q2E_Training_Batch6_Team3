package com.wf.training.bootapprestfulcrud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SearchCompanyProfile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String searchCompany;
	
	
	public String getSearchCompany() {
		return searchCompany;
	}

	public void setSearchCompany(String searchCompany) {
		this.searchCompany = searchCompany;
	}
	
	
	
}
