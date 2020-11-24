package com.wf.training.spring.maven.web.model;

import javax.validation.constraints.NotBlank;

public class Company {
	
	
	private String companycode;
	
	@NotBlank(message = "Company name is mandatory!")
	private String CompanyName;
	
	@NotBlank(message = "Operations is mandatory!")
	private String Operations;
	
	@NotBlank(message = "Share Count is mandatory!")
	private String ShareCount;
	
	@NotBlank(message = "Open Share price is mandatory!")
	private String OpenSharePrice;
	
	@NotBlank(message = "Sector is mandatory!")
	private String Sector;
	
	@NotBlank(message = "Currency is mandatory!")
	private String Currency;
	
	@NotBlank(message = "Turnover is mandatory!")
	private String Turnover;

	
	public Company() {
		super();
	}


	public Company(String companycode, String CompanyName, String Operations, String ShareCount, String OpenSharePrice, String Sector,
			String Currency, String Turnover) {
		
		this.companycode = companycode;
		this.CompanyName = CompanyName;
		this.Operations = Operations;
		this.ShareCount = ShareCount;
		this.OpenSharePrice = OpenSharePrice;
		this.Sector = Sector;
		this.Currency = Currency;
		this.Turnover = Turnover;
	}


	public String getCompanycode() {
		return companycode;
	}


	public void setCompanycode(String companycode) {
		this.companycode = companycode;
	}


	public String getCompanyName() {
		return CompanyName;
	}


	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}


	public String getOperations() {
		return Operations;
	}


	public void setOperations(String operations) {
		Operations = operations;
	}


	public String getShareCount() {
		return ShareCount;
	}


	public void setShareCount(String shareCount) {
		ShareCount = shareCount;
	}


	public String getOpenSharePrice() {
		return OpenSharePrice;
	}


	public void setOpenSharePrice(String openSharePrice) {
		OpenSharePrice = openSharePrice;
	}


	public String getSector() {
		return Sector;
	}


	public void setSector(String sector) {
		Sector = sector;
	}


	public String getCurrency() {
		return Currency;
	}


	public void setCurrency(String currency) {
		Currency = currency;
	}


	public String getTurnover() {
		return Turnover;
	}


	public void setTurnover(String turnover) {
		Turnover = turnover;
	}
	
		
	
}
