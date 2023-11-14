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
		Random rand = new Random();
		int num1 = rand.nextInt(3); switch(num1%3) {
	case 0: 
		hellscape.registerEvent(new Gift(true));
		break;
	case 1: 
		hellscape.registerEvent(new Spider(true));
		break;
	case 2: 
		hellscape.registerEvent(new Nothing(true));
		break;
	};hellscape.registerEvent(new RandomEvent(hellscape));
	}
   
}