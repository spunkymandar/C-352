package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/public/info")
	public String getAllInfo() {
		return "getAllInfo() invoked";
	}
	
	@GetMapping("/public/info/{id}")
	public String getAllInfo(@PathVariable ("id") int id) {
		return "getAllInfo() with parameters invoked";
	}
	
	@GetMapping("/info/status")
	public String getAllInfoStatus() {
		return "status invoked";
	}

}
