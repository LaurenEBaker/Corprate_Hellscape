package com.corporate.hellscape.events.StatusCheckEvent;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.Character;
import com.corporate.hellscape.events.StatusEvent;

public class CheckSleepLowEvent extends StatusEvent{

    public void triggerAction(Hellscape hellscape) {
        hellscape.getCharacter().decreaseHealth();
    }

    public boolean isTriggered(Character character) {
        return (character.getStamina() < 50);
    }
}
