package com.Biditvats.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Biditvats.spring.bean.User;

@Controller
public class UserController {
	
	@RequestMapping("/")
	public String userForm(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "welcome";
	}
	
	@RequestMapping("/register")
	public ModelAndView registerUser(@ModelAttribute @Validated User user,
			BindingResult result) {
		if(result.hasErrors())
			return new ModelAndView("welcome");
		else
			return new ModelAndView("regSuccess", "user",user);
	}
}
