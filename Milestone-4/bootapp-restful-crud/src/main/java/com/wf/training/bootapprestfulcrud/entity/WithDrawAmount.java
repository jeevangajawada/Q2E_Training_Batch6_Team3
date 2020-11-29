package com.wf.training.bootapprestfulcrud.entity;

import javax.validation.constraints.*;

public class WithDrawAmount {
	
	@NotBlank(message = "WithDraw Amount is mandatory!")
	private String withdrawAmount;
	
	
	public String getWithdrawAmount() {
		return withdrawAmount;
	}

	public void setWithdrawAmount(String withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}
	
		
	
}
