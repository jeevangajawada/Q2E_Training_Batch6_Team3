package com.wf.training.bootapprestfulcrud.dto;

import javax.validation.constraints.*;

public class LoginPageDTO {
	
	@NotNull(message = "User ID is mandatory!")
	private String userid;
	
	@NotBlank(message = "Password is mandatory!")
	private String password;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
