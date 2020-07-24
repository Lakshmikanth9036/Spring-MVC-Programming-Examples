package com.Biditvats.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Biditvats.domain.Customer;

@Controller
@RequestMapping("/customer/register")
public class CustomerController {
	
	@GetMapping
	public String registrationPage() {
		return "register";
	}
	
	@PostMapping
	public ModelAndView processRegistrationPage(HttpServletRequest request) {
		Customer customer = new Customer();
		customer.setFirstName(request.getParameter("firstName"));
		customer.setLastName(request.getParameter("lastName"));
		customer.setEmail(request.getParameter("email"));
		long mobile = Long.parseLong(request.getParameter("mobile"));
		customer.setMobile(mobile);
		customer.setGender(request.getParameter("gender"));
		return new ModelAndView("welcome", "customer",customer);
	}
}
