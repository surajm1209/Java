package com.practice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class FirstApp {

	@RequestMapping("/welcome")
	public ModelAndView displaymsg()
	{
		ModelAndView model = new ModelAndView();
		model.addObject("message", "First Controller");
		model.setViewName("index");
		return model;
	}
	
	@GetMapping("/java")
	public String display(Model model)
	{
		model.addAttribute("message", "Spring Boot is awsome");
		return "index";
		
	}
}
