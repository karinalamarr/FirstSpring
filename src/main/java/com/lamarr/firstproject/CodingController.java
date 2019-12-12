package com.lamarr.firstproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CodingController {
	
	@RequestMapping("/")
	public String coding() {
		return "Hello Coding Dojo";
	}
	
	@RequestMapping("/coding/python")
	public String python() {
		return "Pyhton & Django was awesome!";
		
	}
	
	@RequestMapping("coding/java")
	public String java() {
		return "Java & Spring are much better!";
	}
	
}
