package com.robots;

import com.behavioral.RobotAction;

public class Roborock extends RobotAction{
	//Concrete Class of Robot
	private String name;
	private String description;
	private int power;
	//Maybe add here a list of rooms?! then bind it with getRoominfo?
	

	public Roborock(String name, String description, int power) {
		
		this.name = name;
		this.description = description;
		this.power = power;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Roborock model: " + this.name;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.description;
	}

	@Override
	public int getPower() {
		// TODO Auto-generated method stub
		return  this.power;
	}

	@Override
	public int mopFeature() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public void leaveDock() {
		System.out.printf("%s leaving the dock%n",getName());
		
		
	}

	@Override
	public void getRoomInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void analyzeEnvironment() {
		System.out.println("It's OK");
		
	}

}
