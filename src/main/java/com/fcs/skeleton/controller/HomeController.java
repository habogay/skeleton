package com.fcs.skeleton.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HomeController {

	@RequestMapping("/")
	public String index() {
		return "Spring Boot WORKS!";
	}

}
