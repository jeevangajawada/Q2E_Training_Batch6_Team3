package com.wf.training.bootapprestfulcrud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wf.training.bootapprestfulcrud.dto.BackOfficeLoginDto;
import com.wf.training.bootapprestfulcrud.dto.CommodityDTO;
import com.wf.training.bootapprestfulcrud.dto.CommodityPriceDto;
import com.wf.training.bootapprestfulcrud.dto.CompanyDTO;
import com.wf.training.bootapprestfulcrud.dto.SearchCommodityDto;
import com.wf.training.bootapprestfulcrud.dto.SearchCompanyDto;
import com.wf.training.bootapprestfulcrud.dto.StockPriceDto;
import com.wf.training.bootapprestfulcrud.service.CommodityService;
import com.wf.training.bootapprestfulcrud.service.CompanyService;

import java.time.LocalDateTime;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;


@Controller
@RequestMapping("/bouser")
public class BackOfficeController {
	
	@Autowired
	private CommodityService commodityService;
	
	@Autowired
	private CompanyService companyService;
	
	@RequestMapping("/home")
	public String returnHome() {
		
		return "BackOfficeUserHomePage";
	}
	
	
	@RequestMapping("/selectModifyCommodity")
	public String selectModifyCommodity(@ModelAttribute("selectCommodity") SearchCommodityDto searchCommodityDto) {
		return "SelectModifyCommodity";
	}
	
	@RequestMapping("/returnModifyCommodity")
	public String returnModifyCommodity(@Valid @ModelAttribute("selectCommodity") SearchCommodityDto searchCommodityDto, BindingResult result, @ModelAttribute("comDto") CommodityDTO comDto, Model model) {
		if (result.hasErrors()) {
			return "SelectModifyCommodity";
		}
		CommodityDTO output = new CommodityDTO();
		
		output = this.commodityService.fetchSingleCommodityByName(searchCommodityDto);
		comDto.setDateTime(LocalDateTime.now().toString());
		model.addAttribute("searchCommodityDto", output);
		
		return "ModifyCommodity";
	}

	@RequestMapping("/validate")
	public String loginValidate() {
		
		return "index";
	}
	
	@RequestMapping("/AddCompany")
	public String returnAddCompany(@ModelAttribute("createCompany") CompanyDTO createCompany,HttpSession session) {
		BackOfficeLoginDto user = (BackOfficeLoginDto)session.getAttribute("BO");
		System.out.print(user.getUserName());
		return "CreateCompany";
	}
	
	@PostMapping("/createCompany")
	public String addCompany(@Valid @ModelAttribute("createCompany") CompanyDTO createCompany,BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "CreateCompany";
		}
		
		CompanyDTO addCompanyOutputDto = this.companyService.addCompany(createCompany);
		
		model.addAttribute("CompanyOutput", addCompanyOutputDto);
		
		return "SaveCompanyDetails";
	}
	
	
	
	@RequestMapping("/modifyCompany")
	public String modifyCompany(@Valid @ModelAttribute("companyNewOutputDto") CompanyDTO companyNewOutputDto, BindingResult result, Model model) {
		
		if (result.hasErrors()) {
			return "ModifyCompany";
		}
		
		CompanyDTO companyOutputDto =this.companyService.modifyCompany(companyNewOutputDto);
		model .addAttribute("CompanyOutput", companyOutputDto);
		
		
		return "SaveCompanyDetails";
	}
	
	
	@RequestMapping("/returnCreateCommodity")
	public String returnAddCommodity(Model model ) {
		CommodityDTO commodityDto=new CommodityDTO();
		commodityDto.setDateTime(LocalDateTime.now().toString());
		model.addAttribute("commodity", commodityDto);
		
		return "CreateCommodity";
	}
	
	@PostMapping("/createCommodity")
	public String addCommodity(@Valid @ModelAttribute("commodity") CommodityDTO dto,BindingResult result,Model model,HttpSession session) {
		if (result.hasErrors()) {
			return "CreateCommodity";
		}
		BackOfficeLoginDto user = (BackOfficeLoginDto)session.getAttribute("BO");
		dto.setBoUserId(user.getUserName());
		CommodityDTO output=this.commodityService.addCommodity(dto);
		model.addAttribute("CommodityOutput", output);
		return "SavedCommodity";
	}
	
	
	
	@RequestMapping("/modifyCommodity")
	public String modifyCommodity(@Valid @ModelAttribute("commodityNewOutputDto") CommodityDTO commodityNewOutputDto, BindingResult result, Model model) {
		
		
		if (result.hasErrors()) {
			return "ModifyCommodity";
		}
		
		CommodityDTO commodityOutputDto =this.commodityService.modifyCommodity(commodityNewOutputDto);
		model .addAttribute("CommodityOutput", commodityOutputDto);
		
		
		return "SavedCommodity";
	}
	
	@RequestMapping("/addCommodityPrice")
	public String addCommodityPrice(@ModelAttribute("commodityPrice") CommodityPriceDto addCommodityDto,Model model) {

		List<String> commodityNames=this.commodityService.fetchAllCommodityNames();
		model.addAttribute("commodityNames",commodityNames);
		return "AddCommodityPrice";
	}
	
	
	@PostMapping("/newCommodityPrice")
	public String newCommodityPrice(@Valid @ModelAttribute("commodityPrice") CommodityPriceDto commodityPriceDto,BindingResult result,Model model) {
		List<String> commodityNames=this.commodityService.fetchAllCommodityNames();
		model.addAttribute("commodityNames",commodityNames);
		if (result.hasErrors()) {
			
			return "AddCommodityPrice";
		}
		if(this.commodityService.addCommodityPrice(commodityPriceDto))
		{
			model.addAttribute("Message", "Commodity price added successfully");
			return "AddCommodityPrice";
		}
		return "AddCommodityPrice";
	}
	@RequestMapping("/selectModifyCompany")
	public String selectModifyCompany(@ModelAttribute("selectCompany") SearchCompanyDto searchCompanyDto) {
		return "SelectModifyCompany";
	}
	
	@RequestMapping("/returnModifyCompany")
	public String returnModifyCompany(@Valid @ModelAttribute("selectCompany") SearchCompanyDto searchCompanyDto, BindingResult result, @ModelAttribute("companyNewOutputDto") CompanyDTO companyNewOutputDto, Model model) {
		if (result.hasErrors()) {
			return "SelectModifyCompany";
		}
		CompanyDTO companyOutputDto = new CompanyDTO();
		
		companyOutputDto = this.companyService.fetchSingleCompanyByName(searchCompanyDto);
		model.addAttribute("searchCompanyDto", companyOutputDto);
		
		return "ModifyCompany";
	}
	
	
	
	
	  @RequestMapping("/addCompanyStockPrice")
		public String addCompanyStockPrice(@ModelAttribute("addstockprice") StockPriceDto addStockDto,Model model) {

			List<String> companyNames=this.companyService.fetchAllCompanyNames();
			model.addAttribute("companyNames",companyNames);
			return "AddCompanyStockPrice";
		}
		
		
		@PostMapping("/newStockPrice")
		public String newStockPrice(@Valid @ModelAttribute("addstockprice") StockPriceDto addStockDto,BindingResult result,Model model) {
			List<String> companyNames=this.companyService.fetchAllCompanyNames();
			model.addAttribute("companyNames",companyNames);
			if (result.hasErrors()) {
				
				return "AddCompanyStockPrice";
			}
			if(this.companyService.addStockPrice(addStockDto))
			{
				model.addAttribute("Message", "Stock price added successfully");
				return "AddCompanyStockPrice";
			}
			return "AddCompanyStockPrice";
		}
	
}
