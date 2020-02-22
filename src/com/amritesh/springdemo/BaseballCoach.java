package com.amritesh.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;

	BaseballCoach() {}
	
	BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins on batting coach.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
}