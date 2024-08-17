package com.practice.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.practice.model.Employee;

@Controller
public class EmployeeController {

	@GetMapping("/register_emp")
	public String showHome() {
		return "home";
	}
	
	@PostMapping("/register_emp")
	public String registerEmployee(Model model, @ModelAttribute("emp") Employee employee) {
		System.out.println("EmployeeController.registerEmployee()");
		System.out.println(employee);
		model.addAttribute("employee", employee);
		return "result";
	}
}
