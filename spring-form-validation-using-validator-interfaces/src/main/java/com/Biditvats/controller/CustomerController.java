package com.Biditvats.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Biditvats.domain.Customer;
import com.Biditvats.validation.CustomerValidator;

@Controller
@RequestMapping("/register")
public class CustomerController {
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.addValidators(new CustomerValidator());
	}
	
	@GetMapping
	public ModelAndView customerRegistrationPage() {
		return new ModelAndView("register", "customer", new Customer());
	}
	
	@PostMapping
	public ModelAndView processCustomerRegistrationPage(@ModelAttribute @Validated Customer customer,
		  BindingResult result) {
		if (result.hasErrors())
			return new ModelAndView("register");
		else
			return new ModelAndView("profile","customer", customer);
	}
}
