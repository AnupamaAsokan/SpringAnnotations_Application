package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PingCoach implements Coach{

@Autowired	
@Qualifier("pingCoachFortuneService")
private FortuneService fortuneService;

	
	public String getDailyWorkout() {
		return "Play Daily for 30 mins";
	}

@PostConstruct
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

@PreDestroy
public void doSomeDestroyStuff() {
	System.out.println("Last step");

}
}
