package com.wf.training.bootapprestfulcrud.dto;

import javax.validation.constraints.*;

public class DepositAmountDTO {
	
	@NotBlank(message = "Deposited Amount is mandatory!")
	private String depositAmount;
	
	
	public String getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(String depositAmount) {
		this.depositAmount = depositAmount;
	}
	
		
	
}
