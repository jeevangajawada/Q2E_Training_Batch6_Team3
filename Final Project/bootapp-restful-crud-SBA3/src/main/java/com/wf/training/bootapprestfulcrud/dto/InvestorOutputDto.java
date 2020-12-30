package com.wf.training.bootapprestfulcrud.dto;

public class InvestorOutputDto {
	
	private String userid;
	private String password;
	private String firstname;
	private String lastname;
	private String pannumber;
	private String mobile;
	private String email;
	private String amountinvested;
	
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

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPannumber() {
		return pannumber;
	}

	public void setPannumber(String pannumber) {
		this.pannumber = pannumber;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAmountinvested() {
		return amountinvested;
	}

	public void setAmountinvested(String amountinvested) {
		this.amountinvested = amountinvested;
	}	
}
