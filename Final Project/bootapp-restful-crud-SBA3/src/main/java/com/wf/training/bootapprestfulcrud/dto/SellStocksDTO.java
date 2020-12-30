package com.wf.training.bootapprestfulcrud.dto;

import javax.validation.constraints.*;

public class SellStocksDTO {
	
	@NotBlank(message = "Existed Stock Name is mandatory!")
	private String existedStockName;
	
	@NotBlank(message = "Sell Qunatity is mandatory!")
	private String sellQuantity;
	
	@NotBlank(message = "Trigger Price is mandatory!")
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
