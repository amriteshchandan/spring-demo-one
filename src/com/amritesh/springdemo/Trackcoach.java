package com.amritesh.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	TrackCoach() {}
	
	TrackCoach(FortuneService fortuneService) {
		System.out.println("[TrackCoach] constructor");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run for 15 minutes straight.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
}