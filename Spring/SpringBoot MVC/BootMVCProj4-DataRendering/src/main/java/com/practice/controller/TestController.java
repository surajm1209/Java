package com.practice.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.practice.model.Employee;

@Controller
public class TestController {

	@GetMapping
	public String showHome() {
		return "home";
	}

	@GetMapping("/report")
	public String showReport(Model model) {

		/*
		 * model.addAttribute("name", "kohli"); model.put("age", 49); model.put("address",
		 * "RCB");
		 * 
		 * String[] countryNames = new String[] { "IND", "USA", "Russia", "UK" };
		 * model.addAttribute("countryNames", countryNames);
		 * 
		 * List<String> subjetList = List.of("java", "jee", "spring", "springboot","hibernate"); 
		 * model.addAttribute("subjectList", subjetList);
		 * 
		 * Set<Long> mobileSet = Set.of(9999777888L, 6665554443L, 888777654L);
		 * model.addAttribute("mobileSet", mobileSet);
		 * 
		 * Map<String, Number> idsMap = Map.of("adhar", 456783, "voterId", 543456L,
		 * "panNo", 4534524L); 
		 * model.addAttribute("idsMap", idsMap);
		 */

		List<Employee> empList = List.of(new Employee(10, "sachin", "batsman", 23456.0),
				new Employee(7, "dhoni", "keeper", 453456.0), new Employee(18, "kohli", "captain", 3456756.0)

		);
		model.addAttribute("empList", empList);

		Employee employee = new Employee(45, "rohith", "batsman", 434567.0);
		model.addAttribute("employee", employee);
		return "show_report";
	}
}
