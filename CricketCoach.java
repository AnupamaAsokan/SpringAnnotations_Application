package com.luv2code.springdemo;

public class CricketCoach implements Coach {

private FortuneService fortuneService;


	/**
 * @param fortuneService
 */
public CricketCoach(FortuneService thefortuneService) {
	this.fortuneService = thefortuneService;
}

	@Override
	public String getDailyWorkout() {
		return "100 runs minimum for a day";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
