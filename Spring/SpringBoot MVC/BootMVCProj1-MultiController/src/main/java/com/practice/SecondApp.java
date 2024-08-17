package com.practice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/second")
public class SecondApp {
	
	@RequestMapping("/welcome")
	public String displaymsg(Model model)
	{
		model.addAttribute("message", "Second Controller");
		return "index";
	}

	@GetMapping("/java")
	public String someOtherWork(Model model)
	{
		model.addAttribute("message", "Second Controller 2nd message");
		return "index";
		
	}
}
