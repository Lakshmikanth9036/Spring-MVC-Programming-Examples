package com.Biditvats.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@RequestMapping("/register")
	public String registrationPage() {
		return "register";
	}
	
	@RequestMapping(value="/register" , method=RequestMethod.POST)
	public String processRegistrationPage(HttpServletRequest request , Model model) {
		model.addAttribute("firstName", request.getParameter("firstName"));
		model.addAttribute("lastName", request.getParameter("lastName"));
		model.addAttribute("email", request.getParameter("email"));
		model.addAttribute("mobile", request.getParameter("mobile"));
		model.addAttribute("gender", request.getParameter("gender"));
		return "welcome";
		
	}
	
}
