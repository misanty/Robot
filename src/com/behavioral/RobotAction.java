package com.behavioral;

import com.robots.IBot;

import com.structural.IRoboAppFunction;

//Implements the Interface that is designed for the bridge pattern 
//The subclasses that extends to this class will be managed individually via this object reference
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
