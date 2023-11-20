package com.corporate.hellscape.events.RandomEvents;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.events.ImmediateEvent;

public class SpiderEvent extends ImmediateEvent {

    public void triggerAction(Hellscape hellscape) {
        hellscape.logMessage("You were bitten by a posionous spider! (health down, stress up, fun down)");
		hellscape.getCharacter().decreaseHealth();
		hellscape.getCharacter().increaseStress();
		hellscape.getCharacter().decreaseFun();
    }
}
