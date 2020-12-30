package com.wf.training.bootapprestfulcrud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "boUser")
public class BackOfficeUser {
	
	@Column(name="FirstName")
	private String firstName;
	
	@Column(name="LastName")
	private String lastName;
	
	@Column(name="Password")
	private String password;
	
	@Column(name="EmailID")
	private String emailId;
	
	@Id
	@Column(name="userDataId")
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int userDataId;
	private String userName;

	public int getUserDataId() {
		return userDataId;
	}

	public void setUserDataId(int userDataId) {
		this.userDataId = userDataId;
	}

	public BackOfficeUser() {
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
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
