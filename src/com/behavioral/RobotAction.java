package com.behavioral;

import com.robots.IBot;

import com.structural.IRoboAppFunction;

//Implements the bridge Interface 
//So that via this objects reference its subclasses will be managed individually
public abstract class RobotAction implements IBot, IRoboAppFunction {
//Template Method
	public RobotAction() {
		// TODO Auto-generated constructor stub

	}

	public void doCleaning() {

		leaveDock();
		analyzeEnvironment();
		message();
	}

	public abstract void leaveDock();

	public abstract void analyzeEnvironment();

	public void message() {
		System.out.println("Started to clean");
	}

}
