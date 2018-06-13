package com.df.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 消费服务
 * @author 段帆
 *
 */
@FeignClient(value = "df-hello",fallback=HelloServiceImpl.class)
public interface HelloService {

	@RequestMapping("/hello")
	String hello(@RequestParam("name") String name);
	
	

}
