package com.example.springboot_config;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ApplicationFeign {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationFeign.class, args);
	}

}
