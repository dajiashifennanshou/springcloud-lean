package com.df.dfribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.df.dfribbon.service.HelloService;

@RestController
public class HelloController {
	@Autowired
	HelloService service;
	
	@RequestMapping("/hello")
	public String hello(String name){
		return service.helloService(name);
	}
}
