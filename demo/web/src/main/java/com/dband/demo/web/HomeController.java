package com.dband.demo.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dband.demo.service.HelloService;
import com.netflix.discovery.DiscoveryClient;

@Controller
public class HomeController {
	@Autowired
	private DiscoveryClient client;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, String> home() {
		HelloService service = ServiceFactory.get(client, "demo-service", HelloService.class);
		Map<String, String> data = new HashMap<String, String>();
		data.put("test", service.sayHello());
		return data;
	}

}
