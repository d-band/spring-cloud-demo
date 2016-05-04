package com.dband.demo.service.impl;

import org.springframework.stereotype.Service;

import com.dband.demo.service.HelloService;

@Service("helloService")
public class HelloServiceImpl implements HelloService {

  @Override
	public String sayHello() {
		return "Hello world";
	}
}
