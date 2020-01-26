package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {

	@RequestMapping("check")
	public String checkOutput() {
		return "Hello World!!";
		
	}
}
