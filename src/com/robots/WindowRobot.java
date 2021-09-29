package com.robots;

import com.behavioral.RobotAction;
import com.structural.IwindowBot;

public class WindowRobot extends RobotAction implements IwindowBot {

	private String name;
	private String description;
	private int power;
	private boolean on = false;
	private int timer;
	private int cycle = 3;
	
	
	
	public WindowRobot(String name, String description, int power) {
		this.name = name;
		this.description = description;
		this.power = power;
		
		
		
	}
	
	public WindowRobot() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
	
		return "Window robot: " + this.name;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.description;
	}

	@Override
	public int getPower() {
		// TODO Auto-generated method stub
		return this.power;
	}

	@Override
	public int getCycle() {
		// TODO Auto-generated method stub
		return this.cycle;
	}

	@Override
	public String toString() {
		return "Window robot name=" + name + "\n"
				+ "description=" + description + "\n"
						+ "power=" + power + "\n"
								+ "cleans windows ="
				+ getCycle() +"times";
	}

	@Override
	public boolean isOn() {
		// TODO Auto-generated method stub
		return this.on;
	}

	@Override
	public void on() {
		this.on = true;
		
	}

	@Override
	public void off() {
		this.on = false;
		
	}

	@Override
	public void start() {
		this.on = true;
		doCleaning();
		
	}

	@Override
	public void pause() {
		this.on = false;
		
	}

	@Override
	public void setTimer(int minute) {
		if (minute > 0 && minute < 60) {
			this.timer += minute;
			if (this.timer > 60) {
				this.timer = 60;
				System.out.println("Timer cannot be set more than 1 hour");
			}
		}
		System.out.printf("I will start in %d minutes", this.timer);
		
	}

	@Override
	public void showStatus() {
		System.out.println(this.toString());
		
	}

	@Override
	public void leaveDock() {
	System.out.println("Place me on the window");
		
	}

	@Override
	public void analyzeEnvironment() {
		
		System.out.println("Windows are mess!");	
	}


}
