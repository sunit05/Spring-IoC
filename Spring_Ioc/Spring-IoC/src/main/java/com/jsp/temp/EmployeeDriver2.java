package com.jsp.temp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDriver2 {
	public static void main(String[] args) {
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("myspring.xml");

		Employee employee = (Employee) applicationContext.getBean("MyEmployee");
//		employee.id = 1;
//		employee.name="A";
//		employee.mail="a@mail";
//		
		employee.empDetails();
	
	}
}
