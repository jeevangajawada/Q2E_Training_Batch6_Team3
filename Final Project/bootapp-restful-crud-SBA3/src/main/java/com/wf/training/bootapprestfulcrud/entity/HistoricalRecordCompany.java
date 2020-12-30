package com.wf.training.bootapprestfulcrud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "CompanyPriceArchive")
public class HistoricalRecordCompany {

	@Id  
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long companyHistoricalDataId;
	private Long companyCode;
	private float stockPrice; 
	private String dateTime;
	private String currency;
	
	public Long getCompanyHistoricalDataId() {
		return companyHistoricalDataId;
	}
	public void setCompanyHistoricalDataId(Long companyHistoricalDataId) {
		this.companyHistoricalDataId = companyHistoricalDataId;
	}
	
	public Long getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(Long companyCode) {
		this.companyCode = companyCode;
	}
	public float getStockPrice() {
		return stockPrice;
	}
	public void setStockPrice(float stockPrice) {
		this.stockPrice = stockPrice;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
}
