package com.practice.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {

	@GetMapping("/info/{id}") // course/info/5
	public ResponseEntity<String> getCourseInfo(@PathVariable Integer id) {
		
		String body = null;
		if (id == 5) {
			body = "SpringBoot-MicroServices batch by Suraj Mishra";
		} else if (id == 6) {
			body = "Java Real Time Project batch by Shubham Deshpande";
		} else {
			body = "Contact Suraj Mishra portal for the information";
		}
		ResponseEntity<String> entity = new ResponseEntity<String>(body, HttpStatus.OK);
		return entity;
	}
	
	@GetMapping("/info/{id}/{name}") // course/info/5/surajmishra
	public ResponseEntity<String> getCourseDetails(
			@PathVariable String id,
			@PathVariable String name) {

		String body = null;
		if (id.equals("5") && name.equalsIgnoreCase("surajmishra")) {
			body = "Java Real Time Project batch by Suraj Mishra";
		} else if (id.equals("5") && name.equalsIgnoreCase("shubham")) {
			body = "Java Real Time Project Shubham";
		} else {
			body = "Contact Suraj Mishra portal for the information";
		}
		ResponseEntity<String> entity = new ResponseEntity<String>(body, HttpStatus.OK);
		return entity;
	}
}
