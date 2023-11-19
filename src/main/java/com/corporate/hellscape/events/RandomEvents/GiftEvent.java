package com.corporate.hellscape.events.RandomEvents;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.events.ImmediateEvent;

public class GiftEvent extends ImmediateEvent {

    public void triggerAction(Hellscape hellscape) {
        System.out.println("your friend got you a nice gift");
		hellscape.getCharacter().decreaseStress();
		hellscape.getCharacter().increaseFun();;
    }
}
