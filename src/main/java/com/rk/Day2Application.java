package com.rk;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Day2Application {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans_autowire.xml");
		Item bean1 = (Item) context.getBean("Item1");
		Item bean2 = (Item) context.getBean("Item2");
		System.out.println(bean1.getPrice() + bean2.getPrice());

	}

}
