package com.PMS.Sba;
public class InvestorRegistrationPage

{
	private String userid;
	private String password;
	private String reenterpassword;
	private String firstname;
	private String lastname;
	private String pannumber;
	private String male;
	private int age;
	private String place;
	private String address;
	private int phonenumber;
	private String emailid;
	private int amountinvested;
	
	public InvestorRegistrationPage() {
		this.amountinvested = 2500;
	}
	
	public InvestorRegistrationPage(String userid, String password, String firstname, String lastname, String pannumber,
			String male, int age, String place, String address, int phonenumber, String emailid, String reenterpassword,
			int amountinvested) {
		super();
		this.userid = userid;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.pannumber = pannumber;
		this.male = male;
		this.age = age;
		this.place = place;
		this.address = address;
		this.phonenumber = phonenumber;
		this.emailid = emailid;
		this.reenterpassword = reenterpassword;
		this.amountinvested = amountinvested;
	}
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
	public String getMale() {
		return male;
	}
	public void setMale(String male) {
		this.male = male;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getReenterpassword() {
		return reenterpassword;
	}
	public void setReenterpassword(String reenterpassword) {
		this.reenterpassword = reenterpassword;
	}
	public int getAmountinvested() {
		return amountinvested;
	}
	public void setAmountinvested(int amountinvested) {
		this.amountinvested = amountinvested;
	}
}