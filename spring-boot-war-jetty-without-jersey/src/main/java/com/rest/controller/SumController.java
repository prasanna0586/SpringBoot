package com.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rest.bean.HelloBean;

@RestController
public class SumController {
	
	@RequestMapping("/sum")
	public Integer sum (@RequestParam (value = "num1") Integer num1, @RequestParam (value = "num2") Integer num2) {	
		return num1 + num2;
	}
	
	@RequestMapping("/hello")
	public HelloBean hello () {
		return new HelloBean("Prasanna");
	}
	
	@RequestMapping("/sayHello")
	public String sayHello () {
		return "Lakshmi";
	}
	
}
