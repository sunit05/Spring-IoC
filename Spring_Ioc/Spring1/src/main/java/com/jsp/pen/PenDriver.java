package com.jsp.pen;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class PenDriver {

	public static void main(String[] args) {

		ClassPathResource classPathResource = new ClassPathResource("myspring.xml");

		BeanFactory beanFactory = new XmlBeanFactory(classPathResource);

		Pen pen = (Pen) beanFactory.getBean("myPen");
		pen.write();
		
	}
}
