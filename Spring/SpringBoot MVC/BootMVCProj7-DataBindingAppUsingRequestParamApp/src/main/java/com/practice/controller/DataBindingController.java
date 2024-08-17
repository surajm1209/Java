package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DataBindingController {

	//URL ->http://locahost:9999/data?no=10&name=sachin
	@GetMapping("/data")
	public String bindData1(Model model, @RequestParam("no") Integer sno,
			@RequestParam("name") String sname) {
		System.out.println("DataBindingController.bindData()");
		System.out.println("SNO   is :: " + sno);
		System.out.println("SNAME is :: " + sname);
		model.addAttribute("sno",sno);
		model.addAttribute("sname",sname);
		return "show_data";
	}

	@GetMapping("/data1")
	public String bindData(Model model, @RequestParam Integer sno,
			@RequestParam(defaultValue = "sachin") String sname) {
		System.out.println("DataBindingController.bindData()");
		System.out.println("SNO   is :: " + sno);
		System.out.println("SNAME is :: " + sname);
		model.addAttribute("sno",sno);
		model.addAttribute("sname",sname);
		return "show_data";
	}
}
