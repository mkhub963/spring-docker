package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HelloWorld {
	
	@RequestMapping("/message")
	public String sayHi() {
		return "Hi, My name is Mahesh kumar";
	}

}
