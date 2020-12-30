package com.wf.training.bootapprestfulcrud.dto;

import javax.validation.constraints.*;

public class WithDrawAmountDTO {
	
	@NotBlank(message = "WithDraw Amount is mandatory!")
	private String withdrawAmount;
	
	
	public String getWithdrawAmount() {
		return withdrawAmount;
	}

	public void setWithdrawAmount(String withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}
	
		
	
}
