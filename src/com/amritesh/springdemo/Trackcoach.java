package com.amritesh.springdemo;

public class Trackcoach implements Coach {
	@Override
	public String getDailyWorkout() {
		return "Run for 15 minutes straight.";
	}
}