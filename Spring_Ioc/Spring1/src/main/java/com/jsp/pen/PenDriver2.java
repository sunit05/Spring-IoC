package com.jsp.pen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PenDriver2 {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("myspring.xml");
		
		Pen pen=(Pen) applicationContext.getBean("myPen");
		pen.write();
	}
}