package com.corporate.hellscape.events.RandomEvent;

import java.util.Random;
import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.events.TimedEvent;

public class RandomEvent extends TimedEvent{

    public RandomEvent(Hellscape hellscape) {
		Random ran = new Random();
		SetDelay(ran.nextInt(), hellscape);
	}

	protected void triggerAction(Hellscape hellscape) {

		Random rand = new Random();
		int num1 = rand.nextInt(3);

		switch(num1%3) {
			case 0: 
				hellscape.registerEvent(new GiftEvent());
				break;
			case 1: 
				hellscape.registerEvent(new SpiderEvent());
				break;
			case 2: 
				hellscape.registerEvent(new NothingEvent());
				break;
		}

		hellscape.registerEvent(new RandomEvent(hellscape));
	}
}
