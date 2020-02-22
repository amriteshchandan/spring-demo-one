package com.amritesh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		// singleton Scope
		Coach coachA = context.getBean("myCoach1", Coach.class);
		Coach coachB = context.getBean("myCoach1", Coach.class);
		System.out.println("coachA :: " + coachA);
		System.out.println("coachB :: " + coachB);
		System.out.println("Pointing to same object :: " + (coachA == coachB));
		
		// prototype scope
		Coach coachC = context.getBean("myCoach2", Coach.class);
		Coach coachD = context.getBean("myCoach2", Coach.class);
		System.out.println("coachC :: " + coachC);
		System.out.println("coachD :: " + coachD);
		System.out.println("Pointing to same object :: " + (coachC == coachD));
		
		context.close();
	}
	
}