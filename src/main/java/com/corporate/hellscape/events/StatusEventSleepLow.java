package com.corporate.hellscape.events;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.Character;

public class StatusEventSleepLow extends StatusEvent{

    public void triggerAction(Hellscape hellscape) {
        hellscape.getCharacter().decreaseHealth();
    }

    public boolean isTriggered(Character character) {
        return (character.getSleep() < 50);
    }
}
