package com.wf.training.bootapprestfulcrud.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CommodityRecordArchive")
public class HistoricalRecordCommodity {

	@Id  
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long commodityHistoricalDataId;
	
	private int commodityId;
	private float commodityPrice; 
	private String dateTime;
	
	public Long getCommodityHistoricalDataId() {
		return commodityHistoricalDataId;
	}
	public void setCommodityHistoricalDataId(Long commodityHistoricalDataId) {
		this.commodityHistoricalDataId = commodityHistoricalDataId;
	}
	public int getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(int commodityId) {
		this.commodityId = commodityId;
	}
	public float getCommodityPrice() {
		return commodityPrice;
	}
	public void setCommodityPrice(float commodityPrice) {
		this.commodityPrice = commodityPrice;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	
}
