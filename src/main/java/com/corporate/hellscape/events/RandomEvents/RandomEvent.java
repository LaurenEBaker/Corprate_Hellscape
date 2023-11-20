package com.corporate.hellscape.events.RandomEvents;

import java.util.Random;
import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.events.TimedEvent;

public class RandomEvent extends TimedEvent{

    public RandomEvent(Hellscape hellscape) {
		Random ran = new Random();
		SetDelay(ran.nextInt(60), hellscape);
	}

	protected void triggerAction(Hellscape hellscape) {

		Random rand = new Random();
		int eventDiceRoll = rand.nextInt(4);

		switch(eventDiceRoll) {
			case 0: hellscape.registerEvent(new GiftEvent());          break;
			case 1: hellscape.registerEvent(new SpiderEvent());        break;
			case 2: hellscape.registerEvent(new NothingEvent());       break;
			case 3: hellscape.registerEvent(new NewAssignmentEvent()); break;
		}

		hellscape.registerEvent(new RandomEvent(hellscape));
	}
}
