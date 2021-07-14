package com.rk;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleTest {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans_simple.xml");
		LifeCycleCHeck bean1 = (LifeCycleCHeck) context.getBean("lifeCycle");
	System.out.println(bean1.getMsg());
	}
}
