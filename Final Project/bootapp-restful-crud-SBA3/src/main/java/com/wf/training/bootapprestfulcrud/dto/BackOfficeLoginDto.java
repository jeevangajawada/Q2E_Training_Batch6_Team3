package com.wf.training.bootapprestfulcrud.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class BackOfficeLoginDto {

	@NotBlank(message="Password is Mandatory")
	private String password;
	
	@NotNull(message="User name is Mandatory")
	private String userName;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}


}
