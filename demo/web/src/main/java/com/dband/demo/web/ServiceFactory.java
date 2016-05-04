package com.dband.demo.web;

import org.springframework.remoting.caucho.HessianProxyFactoryBean;

import com.dband.demo.service.HelloService;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;

public class ServiceFactory {
	public static <T> T get(DiscoveryClient client, String virtualId, Class<T> type) {
		InstanceInfo info = client.getNextServerFromEureka(virtualId, false);
		HessianProxyFactoryBean factory = new HessianProxyFactoryBean();
		factory.setServiceUrl(info.getHomePageUrl() + type.getName());
		factory.setServiceInterface(HelloService.class);
		factory.afterPropertiesSet();
		@SuppressWarnings("unchecked")
		T object = (T) factory.getObject();
		return object;
	}
}
