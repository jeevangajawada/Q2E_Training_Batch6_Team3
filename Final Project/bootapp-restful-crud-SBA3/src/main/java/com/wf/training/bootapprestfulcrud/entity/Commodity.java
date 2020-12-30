package com.wf.training.bootapprestfulcrud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CommodityInfo")
public class Commodity {

	@Column(unique = true)
	private String commodityName;
	private String currency;
	private float price;
	private String dateTime;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int commodityId;
	private String boUserId;
	
	public Commodity(String commodityName, String currency, float price, String dateTime, int commodityId,
			String boUserId) {
		super();
		this.commodityName = commodityName;
		this.currency = currency;
		this.price = price;
		this.dateTime = dateTime;
		this.commodityId = commodityId;
		this.boUserId = boUserId;
	}
	
	public Commodity() {

	}

	public String getCommodityName() {
		return commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public int getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(int commodityId) {
		this.commodityId = commodityId;
	}
	public String getBoUserId() {
		return boUserId;
	}
	public void setBoUserId(String boUserId) {
		this.boUserId = boUserId;
	}
	
	
	
}
