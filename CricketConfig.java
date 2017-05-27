package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CricketConfig {

	@Bean
	public FortuneService cricketFortuneService(){
		return new CricketFortuneService();
	}
	
	@Bean
	public Coach cricketCoach(){
		return new CricketCoach(cricketFortuneService());
	}
}
