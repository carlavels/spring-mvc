package com.springdemo.persons.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonHomeController {
	
	@RequestMapping("/personHomepage")
	public String showPersonHomePage() {
		return "person/person-home-page";
	}
}
