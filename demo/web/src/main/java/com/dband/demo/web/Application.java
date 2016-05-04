package com.dband.demo.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Application {

	public static void main(String[] args) {
		if (args.length > 0) {
			System.setProperty("server.port", args[0]);
		}
		
		SpringApplication.run(Application.class, args);
	}
}
