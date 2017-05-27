package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

//Read the spring java class
		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext (SportConfig.class);
//Retrieve bean from the spring container	
		SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);
		
//call a method on the bean
		System.out.println("Dailyworkout: " +theCoach.getDailyWorkout());
//call a method on the bean
		System.out.println("DailyFortune: " +theCoach.getDailyFortune());
		
		System.out.println("Email: "+theCoach.getEmail());
		System.out.println("Name: " +theCoach.getName());
//close the container
		context.close();

	}

}
