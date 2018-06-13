package com.df.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
/**
 * 消费者
 * @author 段帆
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class DfFeignApplication {
	public static void main(String[] args) {
		SpringApplication.run(DfFeignApplication.class, args);
	}
}
