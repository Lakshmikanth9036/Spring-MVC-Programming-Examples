package com.Biditvats.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Biditvats.domain.Customer;



@Controller
@RequestMapping("/customer/register")
public class CustomerController {

	@GetMapping
	public ModelAndView registrationPage() {
		return new ModelAndView("register", "customer", new Customer());
	}

	@PostMapping
	public ModelAndView processRegistrationPage(@ModelAttribute Customer customer) {
		return new ModelAndView("profile", "customer", customer);
	}
}

