package edu.mum.cs425.demos.eLibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	//@RequestMapping(value = "/eLibrary", method = RequestMethod.Get)
	@GetMapping(value = {"home/elibrary"})
	public String dislpayHomepage() {
		return "home/index";
	}	

}
