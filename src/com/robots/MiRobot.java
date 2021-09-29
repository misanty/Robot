package com.robots;

import com.behavioral.RobotAction;

public class MiRobot extends RobotAction implements Irobot{

	// Concrete Class of Robot
	private String name;
	private String description;
	private int power;
	private boolean on = false;
	private int timer;

	public MiRobot(String name, String description, int power) {
		this.name = name;
		this.description = description;
		this.power = power;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
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
	public boolean mopFeature() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void leaveDock() {
		System.out.printf("%s leaving the dock\n", getName());

	}

	@Override
	public void analyzeEnvironment() {
		System.out.println("It's messy");

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
		on = true;
		doCleaning();

	}

	@Override
	public void pause() {
		on = false;
	}

	@Override
	public void setTimer(int minute) {

		if (minute > 0 && minute < 60) {
			this.timer += minute;
			if (this.timer > 180) {
				this.timer = this.timer - 60;
				System.out.println("Timer cannot be set more than 3 hours");
			}
		}
		System.out.printf("I will start in %d minutes", this.timer);

	}

	@Override
	public void showStatus() {
		System.out.println(this.toString());

	}

	@Override
	public String toString() {
		return "MiRobot model I'm=" + getName() + "\n" + "My short info=" + getDescription() + "\n" + "power="
				+ getPower() + "\n" + "Do I have mop feature= " + (mopFeature() ? "nope" : "naravno") + "\n"
				+ "I'm currently=" + (isOn() ? "working" : "waiting for the work");
	}

}
