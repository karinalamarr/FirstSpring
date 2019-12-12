package com.lamarr.firstproject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {

	@RequestMapping("/m/{track}/{module}/{lesson}")
    public String showLesson(@PathVariable("track") String track, @PathVariable("module") String module, @PathVariable("lesson") String lesson){
    	return "Track: " + track + ", Module: " + module + ", Lesson: " + lesson;
    
	}
	
	@RequestMapping("/dojo")
	public String dojo() {
		return "The Dojo is awesome!";
	}
	
	@RequestMapping("/burbank/dojo")
	public String burbank() {
		return "SJ Dojo is located in Burbank";
	}
	
}
	
