package com.df.dfribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
/**
 * ribbon方式访问调用接口
 * @author 段帆
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class DfRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(DfRibbonApplication.class, args);
	}
	/**
	 * 拿到对应的类操作消费服务的接口
	 * @return
	 */
	@Bean
	@LoadBalanced
	RestTemplate template() {
		return new RestTemplate();
	}
}
