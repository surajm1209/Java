package com.practice.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@GetMapping(value="/")
	public String showReport(Map<String, Object> model) {
		System.out.println("Hello world");
		return "home";
	}
}
