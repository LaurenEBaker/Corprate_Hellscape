package com.corporate.hellscape.events;

import com.corporate.hellscape.Hellscape;

public class StatusEventHungerLow extends StatusEvent{

    public void triggerAction(Hellscape hellscape) {
        if(isTriggered(hellscape)){
            hellscape.getCharacter().decreaseHealth();
        }
    }
    
}
