package com.springdemo.persons.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/police")
public class PoliceController {
	
		@RequestMapping("/sayHello")
		public String sayHello() {
			return "person/police-hello";
		}
}
