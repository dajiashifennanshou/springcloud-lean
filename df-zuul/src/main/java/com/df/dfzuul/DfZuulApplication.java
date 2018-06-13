package com.df.dfzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
/**
 * 请求转发
 * @author 段帆
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class DfZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(DfZuulApplication.class, args);
	}
}
