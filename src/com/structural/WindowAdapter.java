package com.structural;

import com.robots.Irobot;

public class WindowAdapter implements Irobot {
//Adapter Class
	IwindowBot iwindowBot;
	
	public WindowAdapter(IwindowBot windowBot) {
	this.iwindowBot = windowBot; 
	}

	@Override
	public String getName() {
		
		return iwindowBot.getName();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return iwindowBot.getDescription();
	}

	@Override
	public int getPower() {
		// TODO Auto-generated method stub
		return iwindowBot.getPower();
	}

	@Override
	public int mopFeature() {
		
		return iwindowBot.getCycle();
	}

}
