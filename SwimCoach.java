package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
@Value ("${foo.email}")	
private String email;
@Value ("${foo.name}")	
private String Name;

@Qualifier("sadFortuneSrvice")	
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService thefortuneService) {
		this.fortuneService = thefortuneService;
	}

	
	public String getEmail() {
		return email;
	}


	public String getName() {
		return Name;
	}


	@Override
	public String getDailyWorkout() {
		return "Swim for a warm up";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
