package com.df.produce.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务生产者
 * @author df
 *
 */
@RestController
public class HelloController {

	@Value("${server.port}")
	private String port;

	@RequestMapping("/hello")
	public String hello(String name) {
		return "Hello " + name + ",From port:" + port;
	}

}
