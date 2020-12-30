package com.wf.training.bootapprestfulcrud.service;

import java.util.List;

import com.wf.training.bootapprestfulcrud.dto.CommodityDTO;
import com.wf.training.bootapprestfulcrud.dto.CommodityPriceDto;
import com.wf.training.bootapprestfulcrud.dto.SearchCommodityDto;



public interface CommodityService {


	public CommodityDTO addCommodity(CommodityDTO dto);

	public CommodityDTO fetchSingleCommodityByName(SearchCommodityDto searchCommodityDto);

	public CommodityDTO fetchSingleCommodityByName(String commodityName);
	public CommodityDTO modifyCommodity(CommodityDTO commodityNewOutputDto);
	public List<CommodityDTO> fetchAllCommodity() ;
	public List<String> fetchAllCommodityNames();
	public boolean addCommodityPrice(CommodityPriceDto commodityPriceDto);

	
}
