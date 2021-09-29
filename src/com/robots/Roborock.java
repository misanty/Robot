package com.robots;

import com.behavioral.RobotAction;


public class Roborock extends RobotAction implements Irobot {
	//Concrete Class of Robot
	private String name;
	private String description;
	private int power;
	private boolean on = false;
	private int timer;
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
	public boolean mopFeature() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void leaveDock() {
		System.out.printf("%s leaving the dock%n",getName());
		
		
	}



	@Override
	public void analyzeEnvironment() {
		System.out.println("The place is OK");
		
	}

	@Override
	public boolean isOn() {
		// TODO Auto-generated method stub
		return this.on;
	}

	@Override
	public void on() {
		on = true;
		
	}

	@Override
	public void off() {
		on = false;
		
	}

	@Override
	public void start() {
		on = true;
		super.doCleaning();
		
		
	}

	@Override
	public void pause() {
		on = false;
		
	}

	@Override
	public void setTimer(int minute) {
		this.timer += minute;
		System.out.printf("I will start in %d minutes",this.timer);
		
	}
	

	@Override
	public void showStatus() {
		
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Roborock model I'm=" + getName() + "\n"
				+ "my short info=" + getDescription() + "\n"
						+ "Power="
				+ getPower() + "\n"
						+ "Do I have mop feature= " + (mopFeature() ? "nope" : "of course") + "\n"
								+ "I'm currently=" + (isOn() ? "working" : "waiting for the work" );
	}

	
	

}
