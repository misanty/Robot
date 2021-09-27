import com.behavioral.RobotAction;
import com.creational.RobotFactory;
import com.creational.RobotType;
import com.robots.Irobot;


public class Main {
	static RobotFactory factory;
	static Irobot action;
	static RobotAction robotAction;
	
	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	factory = new RobotFactory();
	action = factory.getRobot(RobotType.ROBOROCK, "Robito", "Clean all the surfaces", 250);
	robotAction = (RobotAction) action;
	getInfo(action);
	robotAction.doCleaning();
	
	action = factory.getRobot(RobotType.WINDOWROBOT, "Win Bot", "clean windows", 300);
	getInfo(action);
	
	

	}
	
	public static void getInfo(Irobot ibot) {
		Irobot bot = ibot;
		System.out.println("***********************************");
		System.out.println(bot.getName());
		System.out.println(bot.getDescription());
		System.out.println(bot.getPower());
		System.out.println("***********************************");
	}

	
}
