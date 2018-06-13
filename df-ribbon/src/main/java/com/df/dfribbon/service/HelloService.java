package com.df.dfribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HelloService {
	@Autowired
	private RestTemplate template;

	@HystrixCommand(fallbackMethod = "helloError")
	public String helloService(String name) {
		return template.getForObject("http://df-hello/hello?name=" + name, String.class);
	}

	public String helloError(String name) {
		return "Service Error:" + name;
	}
}
