package com.amritesh.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;

	CricketCoach() {
		System.out.println("[CricketCoach] no-arg constructor");
	};
	
	// Spring will call this setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("[CricketCoach] setFortuneService");
		this.fortuneService = fortuneService;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("[CricketCoach] setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("[CricketCoach] setTeam");
		this.team = team;
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