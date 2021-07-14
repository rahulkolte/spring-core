package com.rk;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDeptTest {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans_autowire.xml");

		
		
		
		// Constructor based
		//EmployeeBean bean1 = (EmployeeBean) context.getBean("employeeBeanByCon");
		//bean1.print();
		// ByType
		//EmployeeBean bean2 = (EmployeeBean) context.getBean("employeeBeanByType");
	//	bean2.print();
		// By Name based
		//EmployeeBean bean3 = (EmployeeBean) context.getBean("employeeBean");
	//	bean3.print();
		
	    // Qualifier
		EmployeeBean bean4 = (EmployeeBean) context.getBean("emp");
		bean4.print();
	
	}
}
