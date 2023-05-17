package com.security.workshop.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greeting/")
public class GreetingController {
	
	@GetMapping
	public ResponseEntity<String> sayHello(){
		return ResponseEntity.ok("Hello From Our Api");
	}
	
	@GetMapping("/say-goodbye")
	public ResponseEntity<String> sayGoodbye(){
		return ResponseEntity.ok("Good Bye and see your later");
	}
}
