package com.wf.training.bootapprestfulcrud.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.DecimalMin;

import java.time.LocalDateTime;

public class CommodityPriceDto {
	
	
	private String commodityName;
	private String dateTime;
	@DecimalMin("0.1")
	@NotNull(message="Commodity price should not be empty")
	private Float commodityPrice;
	
	public String getCommodityName() {
		return commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public Float getCommodityPrice() {
		return commodityPrice;
	}
	public void setCommodityPrice(Float commodityPrice) {
		this.commodityPrice = commodityPrice;
	}
	
	
	
	

}
