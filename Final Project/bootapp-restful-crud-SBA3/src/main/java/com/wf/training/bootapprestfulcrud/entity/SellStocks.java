package com.wf.training.bootapprestfulcrud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SellStocks {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String existedStockName;
	
	private String sellQuantity;
	
	private String triggerPrice;


	public String getExistedStockName() {
		return existedStockName;
	}

	public void setExistedStockName(String existedStockName) {
		this.existedStockName = existedStockName;
	}
	
	public String getSellQuantity() {
		return sellQuantity;
	}

	public void setsellQuantity(String sellQuantity) {
		this.sellQuantity = sellQuantity;
	}
	
	public String getTriggerPrice() {
		return triggerPrice;
	}

	public void setTriggerPrice(String triggerPrice) {
		this.triggerPrice = triggerPrice;
	}

	
	
}
