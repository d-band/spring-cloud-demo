package com.dband.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianServiceExporter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.dband.demo.service.HelloService;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {
	@Autowired
	private HelloService helloService;

	@Bean(name = "/com.dband.demo.service.HelloService")
	public HessianServiceExporter helloService() {
		HessianServiceExporter exporter = new HessianServiceExporter();
		exporter.setService(helloService);
		exporter.setServiceInterface(HelloService.class);
		return exporter;
	}
}
