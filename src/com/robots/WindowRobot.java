package com.robots;

import com.structural.IwindowBot;

public class WindowRobot implements IwindowBot {

	private String name;
	private String description;
	private int power;
	
	
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
		return 3;
	}

	@Override
	public String toString() {
		return "Window robot name=" + name + "\n"
				+ "description=" + description + "\n"
						+ "power=" + power + "\n"
								+ "cleans windows ="
				+ getCycle() +"times";
	}


}
