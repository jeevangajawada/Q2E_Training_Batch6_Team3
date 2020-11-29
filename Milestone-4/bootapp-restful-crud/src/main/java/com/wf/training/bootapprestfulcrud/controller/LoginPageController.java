package com.wf.training.bootapprestfulcrud.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wf.training.bootapprestfulcrud.entity.Investor;
import com.wf.training.bootapprestfulcrud.entity.LoginPage;

@Controller
@RequestMapping("/homeinvadmlogin")
public class LoginPageController {

	//dashboard for employee
	// @RequestMapping("/home")  // /employee/home
	// multiple url can be mapped
	
	/*
	 * @RequestMapping("/invadmdashboardd") public String register(Model model) { //
	 * business logic
	 * 
	 * // share a blank/empty employee object with jsp to map with spring form
	 * LoginPage loginpage = new LoginPage(); model.addAttribute("loginpage",
	 * loginpage); String loginuserid= loginpage.getUserid(); String loginpwd=
	 * loginpage.getPassword();
	 * 
	 * if(loginuserid.equalsIgnoreCase("admin") &&
	 * loginpwd.equalsIgnoreCase("admin")) return "BackOfficeHomePage"; else return
	 * "InvestorDashboardPage"; }
	 */
	
	@RequestMapping("/investorlogin")
	public String investorlogin(Model model) {
		// business logic
		
		LoginPage loginpage = new LoginPage();
		model.addAttribute("loginpage", loginpage);
		
		return "LoginPage";
	}
	
	@RequestMapping("/adminlogin")
	public String adminlogin(Model model) {
		// business logic
		
		LoginPage loginpage = new LoginPage();
		model.addAttribute("loginpage", loginpage);
		
		return "LoginPage";
	}
	
	@PostMapping("/invadmdashboard")
	public String saveProfile(@Valid @ModelAttribute LoginPage loginpage, 
							  BindingResult result) {
		
		String loginuserid= loginpage.getUserid();
		String loginpwd= loginpage.getPassword();
		
		//For Debugging
		System.out.println("Login User Id -> " + loginuserid);
		System.out.println("Login pwd -> " + loginpwd);
		
		if(result.hasErrors()) {
			// revert back the entry form
			return "LoginPage";
		}
		
		  if(loginuserid.equalsIgnoreCase("admin") && loginpwd.equalsIgnoreCase("admin"))
			  return "BackOfficeHomePage";
		  else
			  return "InvestorDashboardPage";
		 
	}

}