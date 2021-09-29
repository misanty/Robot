package com.creational;

import com.robots.IBot;

import com.robots.MiRobot;
import com.robots.Roborock;
import com.robots.WindowRobot;


public class RobotFactory {

	//Factory method
	public IBot getRobot(RobotType type, String name, String description, int power ) {
		
		IBot irobot;
		switch(type) {
		case MIROBOT:
			irobot = new MiRobot(name, description, power);
			break;
		case ROBOROCK:
			irobot = new Roborock(name, description, power);
			break;
		case WINDOWROBOT:
			irobot = new WindowRobot(name, description, power);

			break;
			
		default:
			throw new IllegalStateException("Unexpected value: " + type);
		
		
		}
		
		return irobot;
		
	}

}
