package com.second.Springmvc.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.second.Springmvc.model.HelloWorld;

@Controller
public class HelloWorldController {

	@RequestMapping("/helloworld")
	public String handler(Model model){
		HelloWorld helloworld = new HelloWorld();
		helloworld.setMessage("Hello World Example Using Spring MVC 5!!!");
		helloworld.setDateTime(LocalDateTime.now().toString());
		model.addAttribute("helloworld", helloworld);
		return "helloworld";
	}
}
