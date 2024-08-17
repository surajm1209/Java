package com.practice.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/test")
public class TestController {

	@GetMapping(value="/report")
	public String showReport(Map<String, Object> model) {
		System.out.println("TestController.showReport()");
		return "display";
	}
}
