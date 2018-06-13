package com.df.feign.service;

import org.springframework.stereotype.Service;

/**
 * 断路器，服务停止响应自己处理
 * @author 段帆
 *
 */
@Service
public class HelloServiceImpl implements HelloService {

	@Override
	public String hello(String name) {
		return "Sorry,Server Error:" + name;
	}

}
