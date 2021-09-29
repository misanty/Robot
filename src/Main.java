import com.behavioral.RobotAction;
import com.creational.RobotFactory;
import com.creational.RobotType;
import com.robots.IBot;
import com.structural.RoboApp;

public class Main {
	static RobotFactory factory;
	static IBot action;
	static RobotAction robotAction;
	static RoboApp app;

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		factory = new RobotFactory();
		action = factory.getRobot(RobotType.ROBOROCK, "Robito", "Mops and vacuums floors", 250);
		robotAction = (RobotAction) action; // Downcasting
		app = new RoboApp(robotAction);

		app.power();
		app.pauseResume();
		app.timer();
		app.displayStatus();
		System.out.println("********************************");
		action = factory.getRobot(RobotType.MIROBOT, "MiRobot", "Just vacuuming floors", 500);
		robotAction = (RobotAction) action;
		app = new RoboApp(robotAction);

		app.power();
		app.pauseResume();
		app.timer();
		app.displayStatus();
		
		System.out.println("********************************");
		
		action = factory.getRobot(RobotType.WINDOWROBOT, "WinBot", "Cleans the windows", 300);
		robotAction = (RobotAction) action;
		app = new RoboApp(robotAction);

		app.power();
	
		app.displayStatus();
		
		
		

		

	}

	

}
