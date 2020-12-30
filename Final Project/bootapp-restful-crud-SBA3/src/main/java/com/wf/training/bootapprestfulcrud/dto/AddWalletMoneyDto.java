package com.wf.training.bootapprestfulcrud.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.DecimalMin;

import java.time.LocalDateTime;

public class AddWalletMoneyDto {
	
	
	
	@NotNull(message="Amount price should not be empty")
	private double addAmount;

	public double getAddAmount() {
		return addAmount;
	}

	public void setAddAmount(double addAmount) {
		this.addAmount = addAmount;
	}
	
	

}
