package com.wf.training.bootapprestfulcrud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
public class Investor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "User ID is mandatory!")
	private String userid;
	
	@NotBlank(message = "Password is mandatory!")
	private String password;
	
	@NotBlank(message = "FirstName is mandatory!")
	private String firstname;
	
	private String lastname;
	
	private String pannumber;
	
	private String mobile;
	
	@NotBlank(message = "Email is mandatory!")
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

	@NotBlank(message = "PAN Number is mandatory!")
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
