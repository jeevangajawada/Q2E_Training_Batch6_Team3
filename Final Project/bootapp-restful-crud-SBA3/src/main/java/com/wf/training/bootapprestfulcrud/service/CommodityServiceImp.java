package com.wf.training.bootapprestfulcrud.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wf.training.bootapprestfulcrud.dto.CommodityDTO;
import com.wf.training.bootapprestfulcrud.dto.CommodityPriceDto;
import com.wf.training.bootapprestfulcrud.dto.SearchCommodityDto;
import com.wf.training.bootapprestfulcrud.entity.Commodity;
import com.wf.training.bootapprestfulcrud.entity.HistoricalRecordCommodity;
import com.wf.training.bootapprestfulcrud.repository.CommodityHistoricalDataRepository;
import com.wf.training.bootapprestfulcrud.repository.CommodityRepository;

@Service
public class CommodityServiceImp implements CommodityService {

	@Autowired
	private CommodityRepository commodityRepository;
	
	
	@Autowired
	private CommodityHistoricalDataRepository commodityHistoricalDataRepository;

	@Override
	public CommodityDTO addCommodity(CommodityDTO dto) {
		
		Commodity com = this.convertInputAddCommodityToEntity(dto);
		Commodity newCom = this.commodityRepository.save(com);
		return this.convertCommodityEntityToOutputDto(newCom);
	}

	@Override
	public CommodityDTO fetchSingleCommodityByName(SearchCommodityDto searchCommodityDto) {
		Commodity commodity = this.convertSearchCommodityDtoToEntity(searchCommodityDto);
		Commodity newCommodity = this.commodityRepository.findByCommodityName(commodity.getCommodityName()).orElse(null);
		CommodityDTO commodityOutputDto = this.convertCommodityEntityToOutputDto(newCommodity);
		return commodityOutputDto;
	}

	private Commodity convertSearchCommodityDtoToEntity(SearchCommodityDto searchCommodityDto) {
		Commodity commodity = new Commodity();
		commodity.setCommodityName(searchCommodityDto.getCommodityName());
		return commodity;
	}

	@Override
	public CommodityDTO modifyCommodity(CommodityDTO commodityNewOutputDto) {
		Commodity commodity = this.convertCommodityOutputToEntity(commodityNewOutputDto);
		Commodity modifyCommodity = this.commodityRepository.save(commodity);
		CommodityDTO dto = this.convertCommodityEntityToOutputDto(modifyCommodity);
		return dto;
	}

	private Commodity convertCommodityOutputToEntity(CommodityDTO commodityNewOutputDto) {
		Commodity commodity = new Commodity();
		commodity.setCommodityId(commodityNewOutputDto.getCommodityId());
		commodity.setCommodityName(commodityNewOutputDto.getCommodityName());
		commodity.setCurrency(commodityNewOutputDto.getCurrency());
		commodity.setDateTime(commodityNewOutputDto.getDateTime());
		commodity.setPrice(commodityNewOutputDto.getPrice());
		return commodity;
	}

	@Override
	public CommodityDTO fetchSingleCommodityByName(String commodityName) {

		Commodity commodity = this.commodityRepository.findByCommodityName(commodityName).orElse(null);
		CommodityDTO commodityDto = this.convertCommodityEntityToOutputDto(commodity);
		return commodityDto;
	}

	private Commodity convertInputAddCommodityToEntity(CommodityDTO dto) {

		Commodity com = new Commodity();
		com.setCommodityName(dto.getCommodityName());
		com.setCurrency(dto.getCurrency());
		com.setPrice(dto.getPrice());
		com.setDateTime(dto.getDateTime());
		com.setBoUserId(dto.getBoUserId());
		return com;
	}

	private CommodityDTO convertCommodityEntityToOutputDto(Commodity newCom) {
		CommodityDTO outputDto = new CommodityDTO();

		outputDto.setCommodityId(newCom.getCommodityId());
		outputDto.setCommodityName(newCom.getCommodityName());
		outputDto.setCurrency(newCom.getCurrency());
		outputDto.setPrice(newCom.getPrice());
		outputDto.setBoUserId(newCom.getBoUserId());

		return outputDto;
	}
	
	@Override
	public List<CommodityDTO> fetchAllCommodity() {
		List<Commodity> commodity = this.commodityRepository.findAll();
		List<CommodityDTO> dto = new ArrayList<CommodityDTO>();
		for (Commodity c : commodity)
			dto.add(this.convertCommodityEntityToOutputDto(c));
		return dto;
	}


	@Override
	public List<String> fetchAllCommodityNames() {
		List<CommodityDTO> commodityList = this.fetchAllCommodity();
		List<String> commodityNames = new ArrayList<String>();
		for (CommodityDTO c : commodityList)
			commodityNames.add(c.getCommodityName());

		return commodityNames;
	}
	

	@Override
	public boolean addCommodityPrice(CommodityPriceDto commodityPriceDto) {
		Commodity commodity = this.commodityRepository.findByCommodityName(commodityPriceDto.getCommodityName()).orElse(null);
		if (commodity != null) {
			HistoricalRecordCommodity entity = new HistoricalRecordCommodity();
			entity.setCommodityId(commodity.getCommodityId());
			entity.setCommodityPrice(commodityPriceDto.getCommodityPrice());
			entity.setDateTime(LocalDateTime.now().toString());
			this.commodityHistoricalDataRepository.save(entity);
			return true;
		}

		return false;
	}

}
