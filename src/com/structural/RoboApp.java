package com.structural;

public class RoboApp implements IRoboApp {
	//This is created as a bridge across other objects for the client side 
	
	IRoboAppFunction appFunction;
	public RoboApp() {
		// TODO Auto-generated constructor stub
	}

	public RoboApp(IRoboAppFunction appFunction) {
		this.appFunction = appFunction;
			
	}

	@Override
	public void power() {
		System.out.println("Power Button");
			if(appFunction.isOn()) {
				appFunction.on();
			}else {
				appFunction.off();
			}
		
	}

	@Override
	public void pauseResume() {
		System.out.println("Pause/Resume");
		if(appFunction.isOn()) {
			appFunction.pause();;
		}else {
			appFunction.start();
		}
	
		
	}

	@Override
	public void timer() {
		System.out.println("Set timer as minutes");
		appFunction.setTimer(10);
	
		
	}

	@Override
	public void displayStatus() {
		appFunction.showStatus();
		System.out.println("\n");
		
	}
	
	

}
