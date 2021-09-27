package com.behavioral;

import com.robots.Irobot;

public abstract class RobotAction implements Irobot {
//Template Method
	public RobotAction() {
		// TODO Auto-generated constructor stub

	}

	public void doCleaning() {

		leaveDock();
		getRoomInfo();
		analyzeEnvironment();
		message();
	}

	public abstract void leaveDock();

	public abstract void getRoomInfo();

	public abstract void analyzeEnvironment();

	public void message() {
		System.out.println("Started to clean");
	}

	

}
