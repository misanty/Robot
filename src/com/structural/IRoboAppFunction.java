package com.structural;

public interface IRoboAppFunction {
	//This is created as a bridge across other objects
	//all the classes which implements this Interface will set the robot's functionality
	boolean isOn();
	void on();
	void off();
	void start();
	void pause();
	void setTimer(int minute);
	void showStatus();

}
