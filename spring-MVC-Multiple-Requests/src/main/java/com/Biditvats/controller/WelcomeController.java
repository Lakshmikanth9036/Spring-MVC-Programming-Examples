package com.Biditvats.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
		
		@RequestMapping("/welcome1")
		public ModelAndView welcomeToSpring1() {
			String greetings = "This is First Request with Bidit";
			return new ModelAndView("success","message",greetings);
		}
		
		@RequestMapping("/welcome2")
		public ModelAndView welcomeToSpring2() {
			String greetings = "This is second Request with Bidit";
			return new ModelAndView("success","message",greetings);
		}
		
		@RequestMapping("/welcome3")
		public ModelAndView welcomeToSpring3() {
			String greetings = "This is third Request with Bidit";
			return new ModelAndView("success","message",greetings);
		}

	}


