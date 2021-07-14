package com.rk;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanLifeCycle implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("\tpostProcessAfterInitialization: " + beanName);
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("\tpost ProcessBeforeInitialization: " + beanName);
		if (bean instanceof LifeCycleCHeck) {
			LifeCycleCHeck lifeCycleCHeck = (LifeCycleCHeck) bean;
			lifeCycleCHeck.setMsg("Hello in Java World!!");
		}
		return bean;
	}
}
