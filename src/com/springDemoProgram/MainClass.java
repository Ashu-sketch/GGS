package com.springDemoProgram;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
public static void main(String[] args) {
	String location="/in/sp/resources/applicationContext.xml";
	ApplicationContext context=new ClassPathXmlApplicationContext(location);
	
	Student std=(Student) context.getBean("stdId1");
	System.out.println(std.getsEmail());
	
	Student std2=(Student) context.getBean("stdId2");
	System.out.println(std2);

	
	
	
}
}
