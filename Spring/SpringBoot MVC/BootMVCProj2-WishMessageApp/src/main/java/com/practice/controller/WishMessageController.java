package com.practice.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.practice.service.IWishMessageService;

@Controller
public class WishMessageController {

	@Autowired
	private IWishMessageService service;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showHome() {
		return "home";// String---> LVN
	}


	@RequestMapping(value = "/wish", method = RequestMethod.GET)
	public Map<String, Object> generateMessage() throws Exception {
		String wmg = service.generateWishMessage();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("msg", wmg);
		return map;
	}
}
