package com.springdemo.persons.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lawyer")
public class LawyerController {
	
	@RequestMapping("/sayHello")
	public String sayHello() {
		return "person/lawyer-hello";
	}
}
