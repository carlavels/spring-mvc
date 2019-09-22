package com.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	// html input form
	@RequestMapping("/showForm")
	public String showInputForm() {
		return "helloworld-form";
	}
	
	// html processed view
	@RequestMapping("/showHello")
	public String showHelloWorld() {
		return "helloworld-view";
	}
	
	
	// jejemon input form
	@RequestMapping("/jejemonForm")
	public String showJejemonForm() {
		return "jejemon-form";
	}
	
	// jejemon processed view
	@RequestMapping("/jejemonView")
	public String showJejemonView(HttpServletRequest request, Model model) {
		
		//Read the input name from form
		String studentName = request.getParameter("studentName");
		
		//jejemonize the name
		String jejemonName = "";
		for(int i = 0; i < studentName.length(); i++) {
			
			if(i % 2 == 0)
				jejemonName += Character.toString(studentName.charAt(i)).toUpperCase();
			else
				jejemonName += Character.toString(studentName.charAt(i)).toLowerCase();
		}
		
		//Add the data in the model via key value pair
		model.addAttribute("jejemonName", jejemonName);
		
		//Return the jsp name of view html
		return "jejemon-view";
	}
}
