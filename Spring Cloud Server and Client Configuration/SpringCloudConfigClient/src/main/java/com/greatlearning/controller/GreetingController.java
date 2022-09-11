package com.greatlearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@Value("${my.greeting}")
	private String greeting;
	
	@Value("${my.list.values}")
	
	private List<String> fruits;
	
	@GetMapping("/greeting")
	public String greeting()
	{
		return greeting;
	}
	
	@GetMapping("/fruits")
	public List<String> getFruits()
	{
		return fruits;
	}

}
