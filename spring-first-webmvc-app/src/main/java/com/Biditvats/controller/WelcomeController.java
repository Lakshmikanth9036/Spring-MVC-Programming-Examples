package com.Biditvats.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@RequestMapping("/welcome")
	public ModelAndView welcomePage() {
		return new ModelAndView("welcome", "message", "This is First Spring MVC App");
	}
}
