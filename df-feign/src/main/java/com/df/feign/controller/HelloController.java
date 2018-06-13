package com.df.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.df.feign.service.HelloService;



/**
 * 消费服务
 * @author 段帆
 *
 */
@RestController
public class HelloController {
	@Autowired
	private HelloService helloService;

	@RequestMapping("/hello")
	public String hello(String name) {
		return helloService.hello(name);
	}

}
