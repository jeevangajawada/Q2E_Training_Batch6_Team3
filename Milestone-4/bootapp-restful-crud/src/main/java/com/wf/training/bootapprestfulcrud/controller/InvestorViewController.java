package com.wf.training.bootapprestfulcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wf.training.bootapprestfulcrud.dto.InvestorOutputDto;
import com.wf.training.bootapprestfulcrud.service.InvestorService;

@Controller
public class InvestorViewController {
	
	@Autowired
	private InvestorService service;
	
	@RequestMapping("/investorlist")
	public String investorList(Model model) {
		List<InvestorOutputDto> investors = this.service.fetchAllInvestors();
		model.addAttribute("investors", investors);
		return "investor-list";
	}
	
}
