package com.creational;

import com.robots.Irobot;
import com.robots.MiRobot;
import com.robots.Roborock;
import com.robots.WindowRobot;
import com.structural.WindowAdapter;

public class RobotFactory {

	//Factory method
	public Irobot getRobot(RobotType type, String name, String description, int power ) {
		
		Irobot irobot;
		switch(type) {
		case MIROBOT:
			irobot = new MiRobot(name, description, power);
			break;
		case ROBOROCK:
			irobot = new Roborock(name, description, power);
			break;
		case WINDOWROBOT:
			WindowRobot windowRobot = new WindowRobot(name, description, power);
			irobot = new WindowAdapter(windowRobot);
			break;
			
		default:
			throw new IllegalStateException("Unexpected value: " + type);
		
		
		}
		
		return irobot;
		
	}

}
