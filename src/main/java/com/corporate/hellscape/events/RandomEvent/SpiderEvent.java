package com.corporate.hellscape.events.RandomEvent;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.events.ImmediateEvent;

public class SpiderEvent extends ImmediateEvent {

    public void triggerAction(Hellscape hellscape) {
        System.out.println("you were bitten by a posionous spider");
		hellscape.getCharacter().decreaseHealth();
		hellscape.getCharacter().increaseStress();
		hellscape.getCharacter().decreaseFun();
    }
}
