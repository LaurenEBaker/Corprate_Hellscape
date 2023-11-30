package com.corporate.hellscape.events.RandomEvents;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.events.ImmediateEvent;

public class GiftEvent extends ImmediateEvent {

    public void triggerAction(Hellscape hellscape) {
        hellscape.logMessage("Your friend got you a nice gift! (stress down, fun up)");
		hellscape.getCharacter().decreaseStressBy(3);
		hellscape.getCharacter().increaseFunBy(3);
    }
}
