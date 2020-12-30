package com.wf.training.bootapprestfulcrud.controller;

import java.sql.SQLException;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wf.training.bootapprestfulcrud.entity.Commodity;
import com.wf.training.bootapprestfulcrud.entity.Company;
import com.wf.training.bootapprestfulcrud.entity.StockPrices;


@Controller
@RequestMapping("/backoffice")
public class BackOfficeViewController {
	
		@RequestMapping("/homepage")
		public String homepage() {
			return "BackOfficeHomePage.jsp";
		}
		
		@RequestMapping("/newCompany")
		public String AddNewCompany(Model model) {
			Company company = new Company();
			model.addAttribute("Company",company);
			return "CreateCompany.jsp";
		}
		
		@RequestMapping("/company-register")
		public String addNewCompany(@Valid @ModelAttribute("Company") Company company, BindingResult result) throws ClassNotFoundException, SQLException {
			
			if(result.hasErrors()) {
				return "CreateCompany.jsp";
			}
			
			return "redirect:/backoffice/homepage";
		}
		
		@RequestMapping("/addstockpricesUI")
		public String addStockPrices(Model model) {
			
			StockPrices stockprices = new StockPrices();
			model.addAttribute("stockprices",stockprices);
			return "AddStockPrices.jsp";
		}
		
		@RequestMapping("/addstockprices")
		public String addStockPrices(@Valid @ModelAttribute("stockprices") StockPrices stockprices, BindingResult result) throws ClassNotFoundException, SQLException {
			
			if(result.hasErrors()) {
				return "AddStockPrices.jsp";
			}
			
			return "redirect:/backoffice/homepage";
		}
		
		@RequestMapping("/createcommodity")
		public String addCommodityUI(Model model) {
			
			Commodity commodity = new Commodity();
			model.addAttribute("commodity",commodity);
			return "CreateCommodity.jsp";
		}
		
		@RequestMapping("/addcommodityprices")
		public String addCommodity(@Valid @ModelAttribute("commodity") Commodity commodity, BindingResult result){
			
			if(result.hasErrors()) {
				return "CreateCommodity.jsp";
			}
			
			return "redirect:/backoffice/homepage";
		}
		
		@RequestMapping("/generatecommissionreportUI")
		public String generateCommissionReportUI() {
			
			return "GenerateCommissionReport.jsp";
		}
		
		@RequestMapping("/generatecommissionreport")
		public String generateCommissionReport(Model model) {
			
			return "GenerateCommissionReport.jsp";
		}
		
		
		@RequestMapping("*")
		public String fallback() {
			return "redirect:/backoffice/homepage";
		}
		
}