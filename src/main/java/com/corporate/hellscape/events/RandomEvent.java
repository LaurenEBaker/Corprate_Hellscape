package com.corporate.hellscape.events;

import java.util.Random;
import com.corporate.hellscape.Hellscape;

public class RandomEvent extends TimedEvent{

    public RandomEvent(Hellscape hellscape) {
		Random ran = new Random();
		SetDelay(ran.nextInt(), hellscape);
	}
	

	@Override
	protected void triggerAction(Hellscape hellscape) {
		int num1 = Random.nextInt(3); switch(num1%3) {
	case 0: 
		hellscape.registerEvent(Event.Gift);
		break;
	case 1: 
		hellscape.registerEvent(Event.Spider);
		break;
	case 2: 
		hellscape.registerEvent(Event.Nothing);
		break;
	};
	}
   
}
