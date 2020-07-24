package com.Biditvats.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/welcome")
	public String welcomePage(ModelMap modelMap) {
		modelMap.addAttribute("message", "This is Java Baesd-MVC Configuration");
		return "welcome";
	}
}
