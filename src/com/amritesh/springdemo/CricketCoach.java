package com.amritesh.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	CricketCoach() {
		System.out.println("[CricketCoach] no-arg constructor");
	};
	
	// Spring will call this setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("[CricketCoach] setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
}