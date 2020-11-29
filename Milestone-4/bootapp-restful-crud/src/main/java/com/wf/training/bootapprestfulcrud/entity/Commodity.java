package com.wf.training.bootapprestfulcrud.entity;

import javax.validation.constraints.NotBlank;


public class Commodity {
	
	private String commodityid;
	
	@NotBlank(message = "Commodity name is mandatory!")
	private String CommodityName;
	
	@NotBlank(message = "Price is mandatory!")
	private String Price;
	
	@NotBlank(message = "Currency is mandatory!")
	private String Currency;
	
	@NotBlank(message = "Date is mandatory!")
	private String Date;

	public String getCommodityid() {
		return commodityid;
	}

	public void setCommodityid(String commodityid) {
		this.commodityid = commodityid;
	}

	public String getCommodityName() {
		return CommodityName;
	}

	public void setCommodityName(String commodityName) {
		CommodityName = commodityName;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}

	public String getCurrency() {
		return Currency;
	}

	public void setCurrency(String currency) {
		Currency = currency;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}
	
	
}
