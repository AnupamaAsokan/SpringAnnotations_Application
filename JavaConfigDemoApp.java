package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

//Read the spring java class
		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext (SportConfig.class);
//Retrieve bean from the spring container	
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
//call a method on the bean
		System.out.println("Dailyworkout: " +theCoach.getDailyWorkout());
//call a method on the bean
		System.out.println("DailyFortune: " +theCoach.getDailyFortune());
//close the container
		context.close();

	}

}
