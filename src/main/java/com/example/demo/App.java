package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	private static ApplicationContext app;
	
	public static void main(String[] args) {
	
		app = new ClassPathXmlApplicationContext("bean.xml");
		MyBean bean = (MyBean)app.getBean("mybean1");
		System.out.println(bean);
		
	}

}
