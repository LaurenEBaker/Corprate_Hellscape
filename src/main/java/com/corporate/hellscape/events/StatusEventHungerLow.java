package com.corporate.hellscape.events;

import com.corporate.hellscape.Hellscape;

public class StatusEventHungerLow extends StatusEvent{

    public void triggerAction(Hellscape hellscape) {
        hellscape.getCharacter().decreaseHealth();
    }

    public boolean isTriggered(Character character) {
        if(character.getHunger() < 50)
            return true;
        return false;
    }
}
