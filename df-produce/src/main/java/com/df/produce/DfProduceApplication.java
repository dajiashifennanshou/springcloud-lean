package com.df.produce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * 启动服务生产者
 * @author df
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class DfProduceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DfProduceApplication.class, args);
	}
}
