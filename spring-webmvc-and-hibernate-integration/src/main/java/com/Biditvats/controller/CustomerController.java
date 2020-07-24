package com.Biditvats.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Biditvats.domain.Customer;
import com.Biditvats.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/register")
	public ModelAndView registrationPage() {
		return new ModelAndView("register", "customer", new Customer());
	}
	
	@PostMapping("/register")
	public ModelAndView processRegistrationPage(@ModelAttribute @Validated Customer customer,
		  BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("register");
		} else {
		Long id = customerService.saveCustomer(customer);
		customer.setId(id);
		return new ModelAndView("profile","customer", customer);
		}
	}
}
