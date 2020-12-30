package com.wf.training.bootapprestfulcrud.dto;

import javax.validation.constraints.*;

public class BuyStocksDTO {
	
	@NotBlank(message = "Stock Name is mandatory!")
	private String stockName;
	
	@NotBlank(message = "Order Qunatity is mandatory!")
	private String orderQuantity;
	
	@NotBlank(message = "Current Price is mandatory!")
	private String currentPrice;


	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	
	public String getOrderQuantitye() {
		return orderQuantity;
	}

	public void setOrderQuantity(String orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
	
	public String getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(String currentPrice) {
		this.currentPrice = currentPrice;
	}

	
	
}
