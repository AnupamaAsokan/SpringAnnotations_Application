package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDemoApp {

	public static void main(String[] args) {
		//Read the spring config file
				ClassPathXmlApplicationContext context = new 
						ClassPathXmlApplicationContext ("applicationContext.xml");
		//Retrieve bean from the spring container	
				Coach theCoach = context.getBean("pingCoach",Coach.class);
				
		//call a method on the bean
				System.out.println("Dailyworkout: " +theCoach.getDailyWorkout());
		//call a method on the bean
				System.out.println("DailyFortune: " +theCoach.getDailyFortune());
		//close the container
				context.close();

			}

	}

