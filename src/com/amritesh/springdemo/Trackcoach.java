package com.amritesh.springdemo;

public class TrackCoach implements Coach {
	@Override
	public String getDailyWorkout() {
		return "Run for 15 minutes straight.";
	}
}