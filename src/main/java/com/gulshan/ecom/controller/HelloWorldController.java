package com.gulshan.ecom.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@GetMapping("/")
	public static String hello() {
		return "Hello World!";
	}
	@GetMapping("/love")
	public static String love() {
		return "Stay single, Love is not for you!";
	}
}
