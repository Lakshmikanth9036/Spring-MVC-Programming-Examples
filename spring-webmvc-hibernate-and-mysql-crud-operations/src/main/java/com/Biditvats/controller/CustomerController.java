package com.Biditvats.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Biditvats.domain.Customer;
import com.Biditvats.service.CustomerService;

@Controller
@RequestMapping("/")
public class CustomerController {
	private static final String LANDING_PAGE = "home";
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping
	public String landingPage(Model model) {
		model.addAttribute("customerList", customerService.findAllCustomers());
		model.addAttribute("customer", new Customer());
		return LANDING_PAGE;
	}
	
	@PostMapping
	public ModelAndView processRegistrationPage(@ModelAttribute @Validated Customer customer,
		  BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView(LANDING_PAGE);
		} else {
			customerService.saveCustomer(customer);
		    return new ModelAndView("redirect:/");
		}
	}
	
	@GetMapping("/update/{customerId}")
	public ModelAndView processUpdateCustomer(@PathVariable Long customerId, Model model) {
		model.addAttribute("customerList", customerService.findAllCustomers());
		model.addAttribute("customer", customerService.findCustomerById(customerId));
		return new ModelAndView(LANDING_PAGE);
	}
	
	@GetMapping("/delete/{customerId}")
	public ModelAndView processDeleteCustomer(@PathVariable Long customerId) {
		customerService.deleteCustomer(customerId);
		return new ModelAndView("redirect:/");
	}
	
}






